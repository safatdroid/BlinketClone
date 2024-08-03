package com.example.userblinketclone

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.widget.addTextChangedListener
import com.example.userblinketclone.databinding.FragmentSignInBinding



class SignInFragment : Fragment() {
    private lateinit var binding: FragmentSignInBinding
    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignInBinding.inflate(inflater, container, false)
        getUserumber()

        onContiueButtonClick()
        return binding.root
    }

            private fun onContiueButtonClick(){
                binding.btnContinue.setOnClickListener {
                   val number = binding.etUserNumber.text.toString()
                    if(number.isEmpty()|| number.length !=10){
                        

                    }
                }
            }
            private fun getUserumber(){
                binding.etUserNumber.addTextChangedListener ( object :TextWatcher {
                    override fun beforeTextChanged(
                        s: CharSequence?,
                        start: Int,
                        count: Int,
                        after: Int
                    ) {
                    }

                    override fun onTextChanged(
                        number: CharSequence?,
                        start: Int,
                        before: Int,
                        count: Int
                    ) {
                            val len = number?.length
                        if(len ==10){
                            binding.btnContinue.setBackgroundColor(ContextCompat.getColor(requireContext(),R.color.green))
                        }
                        else{
                            binding.btnContinue.setBackgroundColor(ContextCompat.getColor(requireContext(),R.color.greyish_blue))
                        }
                    }

                    override fun afterTextChanged(s: Editable?) {

                        }


                })

            }

                }

