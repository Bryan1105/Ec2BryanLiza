package pe.company.ec1bryanliza

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.common.api.GoogleApi
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds
import com.google.android.gms.maps.model.MarkerOptions

class DireccionActivity : AppCompatActivity(), OnMapReadyCallback {
    private lateinit var map: GoogleMap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_direccio)
        val fragmenMaps = supportFragmentManager.findFragmentById(R.id.fragmenMaps) as SupportMapFragment
        fragmenMaps.getMapAsync (this)
    }

    override fun onMapReady(p0: GoogleMap) {
        map = p0
        val lima = LatLng(-12.04315866,-77.46248654)
        val moquegua = LatLng(-6.48778,-76.3597)
        val tarapoto = LatLng(-12.04312866,-77.46348654)
        map.addMarker(MarkerOptions().position(lima).title("SJM"))
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(lima,16f))
        val boundBuilder = LatLngBounds.builder()
            .include(lima)
            .include(tarapoto)
            .include(moquegua)
        map.animateCamera(CameraUpdateFactory.newLatLngBounds(boundBuilder.build(),20))
    }
}