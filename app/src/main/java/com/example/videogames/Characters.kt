package com.example.videogames

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_characters2.*


/**
 * A simple [Fragment] subclass.
 * Use the [Characters.newInstance] factory method to
 * create an instance of this fragment.
 */
class Characters : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_characters2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
            chars_rec.apply{
            layoutManager = LinearLayoutManager(activity)
            adapter = GCAdapter(createData())
        }
    }

    fun createData(): ArrayList<character>{

        val game_chars = ArrayList<character>()
        game_chars.add(character(R.drawable.ardyn,"Ardyn Izunia", "Final Fantasy XV","“Chancellor of Niflheim”", "Alternately known as Ardyn Lucis Caelum, Ardyn handles the Niflheim Empire's political operations for Emperor Aldercapt, and is responsible for the expansion of Verstael Besithia's magitek infantry.",R.raw.stand,"Stand Your Ground"))
        game_chars.add(character(R.drawable.aymeric,"Aymeric de Borel", "Final Fantasy XIV","Lord Commander of the Temple Knights", "Though not of noble birth, he rose in rank by virtue of his countless accomplishments and achieved his current station. As the war against dragonkind rages on, Aymeric risks life and limb to protect his people.",R.raw.solid,"Solid"))
        game_chars.add(character(R.drawable.dk,"Donkey Kong", "Donkey Kong","Cranky's grandson", "Donkey Kong and Mario started out as arch-rivals, but they've patched things up in recent years. These days DK spends his time searching the jungle for bananas instead of kidnapping beautiful maidens. In the past few years, other members of the Kong family have cashed in on DK's fame as well, including his favorite nephew, Diddy",R.raw.dk,"Simian Segue"))
        game_chars.add(character(R.drawable.haur,"Haurchefant Greystone", "Final Fantasy XIV","Presides over Camp Dragonhead", "Haurchefant is an elezen with silvery hair, garbed in full chainmail. At the time of the events of Final Fantasy XIV: Heavensward, Haurchefant is 28 years old.",R.raw.solid,"Solid"))
        game_chars.add(character(R.drawable.light,"Lightning", "Final Fantasy XIII"," Guardian Corps", "Lightning is a young woman with wavy rose pink hair and pale aqua eyes. Lightning's eye color is officially noted as blue, though in the FMVs and promotional art, they often appear green due to green aspects around the pupil.",R.raw.ff13,"Blinded By Light"))
        game_chars.add(character(R.drawable.link,"Link", "The Legend Of Zelda","Hero of Hyrule", "Link is born during the Hyrulean Civil War, and is left in Kokiri Forest by his dying mother in an attempt to spare him from the widespread violence. From then on, Link is fostered by the Great Deku Tree, who raises the Hylian child as a Kokiri so that he will fit in with his peers. However, as Link does not possess a fairy like other Kokiri, he is always something of an outsider, especially in the eyes of Mido, the self-appointed \"Boss of the Kokiri\".",R.raw.zelda,"Legend Of Zelda Theme"))
        game_chars.add(character(R.drawable.lorthemar,"Lor'themar", "World Of Warcraft","Regent Lord of Quel'Thalas", "He used to lead the sin'dorei in the absence of Prince Kael'thas Sunstrider, but after his betrayal and eventual death, Lor'themar became the sole leader of his people. Lor'themar was once the second-in-command to Ranger General Sylvanas Windrunner, and assumed temporary leadership of the high elves after the Scourge onslaught, a role that would pave the way to his regency after the prince's return.",R.raw.wow,"Lament Of The Highborne"))
        game_chars.add(character(R.drawable.luigi,"Luigi", "Super Mario Series","Plumber", "Is a former plumber who resides in the Mushroom Kingdom. Luigi is Mario's younger, taller twin brother",R.raw.mario,"Super Mario Theme"))
        game_chars.add(character(R.drawable.mario,"Mario", "Super Mario Series","Plumber", "is a former plumber who resides in Mushroom Kingdom. Mario also sometimes rules his own land, Mario Land. Mario and his brother, Luigi used to live in Brooklyn as plumbers.",R.raw.mario,"Super Mario Theme"))
        game_chars.add(character(R.drawable.noctis,"Noctis Lucis Caelum", " Final Fantasy XIV","Prince of Insomnia", "",R.raw.stand,"Stand Your Ground"))
        game_chars.add(character(R.drawable.saturos,"Saturos", "Golden Sun","Unknown", "",R.raw.saturos,"Saturos Battle Theme"))
        game_chars.add(character(R.drawable.shepard,"John Shepard", "Mass Effect","Captain of The Normandy", " ",R.raw.protectors,"Protectors Of The Earth"))
        game_chars.add(character(R.drawable.snow,"Snow Villiers", "Final Fantasy XIII","Leader of NORA", "",R.raw.ff13,"Blinded By Light"))
        game_chars.add(character(R.drawable.sylvanas,"Sylvanas Windrunner", "World Of Warcraft","Former Warchief of The Horde", "",R.raw.wow,"Lament Of The Highborne"))




        return game_chars
    }

    }
