package com.example.checksalaryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.transition.Visibility
import com.example.checksalaryapp.constants.Staff
import com.example.checksalaryapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
	lateinit var bindingClass: ActivityMainBinding
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		bindingClass = ActivityMainBinding.inflate(layoutInflater)
		setContentView(bindingClass.root)
		bindingClass.btnCheck.setOnClickListener {
			val checkName = bindingClass.inputName.text.toString()
			val passField = bindingClass.inputPass.text.toString()
			bindingClass.imgFoto.visibility = View.VISIBLE
			when (checkName) {
				Staff.DIRECTOR_NAME -> {
					val tmpText = "Получите ваши ${Staff.DIRECTOR_SALARY}"
					if (passField == Staff.DIRECTOR_PASS){
						bindingClass.showSalary.text = tmpText
						bindingClass.imgFoto.setImageResource(R.drawable.director)
					} else {
						bindingClass.showSalary.text = "Не корректный ПИН_КОД"
						bindingClass.imgFoto.setImageResource(R.drawable.kukish)
					}
				}
				Staff.MANAGER_NAME -> {
					val tmpText = "Получите ваши ${Staff.MANAGER_SALARY}"
					if (passField == Staff.MANAGER_PASS) {
						bindingClass.showSalary.text = tmpText
						bindingClass.imgFoto.setImageResource(R.drawable.manager)
					} else {
						bindingClass.showSalary.text = "Не корректный ПИН-КОД"
						bindingClass.imgFoto.setImageResource(R.drawable.kukish)
					}
				}
				Staff.WORKER_NAME -> {
					val tmpText = "Получите ваши ${Staff.WORKER_SALARY}"
					if (passField == Staff.WORKER_PASS) {
						bindingClass.showSalary.text = tmpText
						bindingClass.imgFoto.setImageResource(R.drawable.worker)
					} else {
						bindingClass.showSalary.text = "Не корректный ПИН-КОД"
						bindingClass.imgFoto.setImageResource(R.drawable.kukish)
					}
				}
				else -> {
					bindingClass.showSalary.text = "Нет такого сотрудника"
					bindingClass.imgFoto.setImageResource(R.drawable.huy)

				}
			}

		}
	}
}

