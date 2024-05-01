package com.example.uygakankulyator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uygakankulyator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var birinchison: String = ""
    var ikkinchison: String = ""
    var amal = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            if (amal == "") {
                birinchison = birinchison + "1"
                binding.view.text = birinchison
            } else if (amal == "-" || amal == "+" || amal == "*" || amal =="/" ) {
                ikkinchison = ikkinchison + "1"
                binding.view.text = ikkinchison
            }
        }
        binding.btn2.setOnClickListener {
            if (amal == "") {
                birinchison = birinchison + "2"
                binding.view.text = birinchison

            } else if (amal == "-" || amal == "+" || amal == "*" || amal =="/") {
                ikkinchison = ikkinchison + "2"
                binding.view.text = ikkinchison
            }

        }

        binding.btn3.setOnClickListener {
            if (amal == "") {
                birinchison = birinchison + "3"
                binding.view.text = birinchison
            } else if (amal == "-" || amal == "+" || amal == "*" || amal =="/") {
                ikkinchison = ikkinchison + "3"
                binding.view.text = ikkinchison
            }

        }
        binding.btn4.setOnClickListener {
            if (amal == "") {
                birinchison = birinchison + "4"
                binding.view.text = birinchison
            } else if (amal == "-" || amal == "+" || amal == "*"|| amal =="/") {
                ikkinchison = ikkinchison + "4"
                binding.view.text = ikkinchison
            }
        }
        binding.btn5.setOnClickListener {
            if (amal == "") {
                birinchison = birinchison + "5"
                binding.view.text = birinchison
            } else if (amal == "-" || amal == "+" || amal == "*"|| amal =="/"|| amal =="/") {
                ikkinchison = ikkinchison + "5"
                binding.view.text = ikkinchison
            }
        }
        binding.btn6.setOnClickListener {
            if (amal == "") {
                birinchison = birinchison + "6"
                binding.view.text = birinchison
            } else if (amal == "-" || amal == "+" || amal == "*"|| amal =="/") {
                ikkinchison = ikkinchison + "6"
                binding.view.text = ikkinchison
            }
        }
        binding.btn7.setOnClickListener {
            if (amal == "") {
                birinchison = birinchison + "7"
                binding.view.text = birinchison
            } else if (amal == "-" || amal == "+" || amal == "*"|| amal =="/") {
                ikkinchison = ikkinchison + "7"
                binding.view.text = ikkinchison
            }
        }
        binding.btn8.setOnClickListener {
            if (amal == "") {
                birinchison = birinchison + "8"
                binding.view.text = birinchison
            } else if (amal == "-" || amal == "+" || amal == "*" || amal =="/") {
                ikkinchison = ikkinchison + "8"
                binding.view.text = ikkinchison
            }
        }
        binding.btn9.setOnClickListener {
            if (amal == "") {
                birinchison = birinchison + "9"
                binding.view.text = birinchison
            } else if (amal == "-" || amal == "+" || amal == "*"|| amal =="/") {
                ikkinchison = ikkinchison + "9"
                binding.view.text = ikkinchison
            }
        }
        binding.btn0.setOnClickListener {
            if (amal == "") {
                birinchison = birinchison + "0"
                binding.view.text = birinchison
            } else if (amal == "-" || amal == "+" || amal == "*"|| amal =="/") {
                ikkinchison = ikkinchison + "0"
                binding.view.text = ikkinchison
            }
        }


        binding.btnminus.setOnClickListener {
            binding.view.text = ""
            amal = "-"

        }
        binding.btnac.setOnClickListener {
            binding.view.setText("")
            birinchison = ""
            ikkinchison = ""

            amal = ""

        }
        binding.btnqoshish.setOnClickListener {
            binding.view.text = ""
            amal = "+"

        }
        binding.btnjavob.setOnClickListener {
            if (amal == "+") {
                binding.view.text =
                    "Natija: ${birinchison.toInt() + ikkinchison.toInt()}"
            } else if (amal == "-") {
                binding.view.text = "Natija:${birinchison.toInt() - ikkinchison.toInt()}"
            } else if (amal == "*") {
                binding.view.text = "Natija:${birinchison.toInt() * ikkinchison.toInt()}"
            }else if (amal =="/") {
                binding.view.text = "Natija:${birinchison.toInt() / ikkinchison.toInt()}"
            }
        }
        binding.btnx.setOnClickListener {
            binding.view.text = ""
            amal = "*"
        }
        binding.btnbolish.setOnClickListener {
            binding.view.text = ""
            amal = "/"
        }
    }
}

