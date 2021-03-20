package com.example.videogames

import android.media.MediaPlayer
import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.char_renglon.*
import kotlinx.android.synthetic.main.fragment_char_info.*
import kotlinx.android.synthetic.main.fragment_char_info.foto_char
import kotlinx.android.synthetic.main.fragment_char_info.nombre_char
import kotlinx.android.synthetic.main.fragment_char_info.estilo_char
import kotlinx.android.synthetic.main.fragment_char_info.origen_char
import kotlinx.android.synthetic.main.fragment_char_info.plot_char


/**
 * A simple [Fragment] subclass.
 * Use the [charInfo.newInstance] factory method to
 * create an instance of this fragment.
 */
class charInfo : Fragment() {

    private val args by navArgs<charInfoArgs>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_char_info, container, false)
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        foto_char.setImageResource(args.chars.picture)
        nombre_char.text = args.chars.name
        estilo_char.text = args.chars.style
        origen_char.text = args.chars.origin
        plot_char.text = args.chars.plot

        // Toast
        val text = "Playing: " + args.chars.secretString
        val duration = Toast.LENGTH_LONG

        val toast = Toast.makeText(context, text, duration)
        toast.show()

        val timer = object: CountDownTimer(13000, 500) {
            var mediaPlayer: MediaPlayer? = MediaPlayer.create(context, args.chars.secretSong)
            override fun onTick(millisUntilFinished: Long) {
                mediaPlayer?.start() // no need to call prepare(); create() does that for you
            }

            override fun onFinish() {
                mediaPlayer?.stop()
                mediaPlayer?.reset()

            }
        }

        timer.start()
    }

}