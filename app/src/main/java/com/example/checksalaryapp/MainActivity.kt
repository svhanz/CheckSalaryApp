package com.example.checksalaryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
			when (checkName) {
				Staff.DIRECTOR_NAME -> {
					val tmpText = "Получите ваши ${Staff.DIRECTOR_SALARY}"
					if (passField == Staff.DIRECTOR_PASS){
						bindingClass.showSalary.text = tmpText
					} else {
						bindingClass.showSalary.text = "Не корректный ПИН_КОД"
					}
				}
				Staff.MANAGER_NAME -> {
					val tmpText = "Получите ваши ${Staff.MANAGER_SALARY}"
					if (passField == Staff.MANAGER_PASS) {
						bindingClass.showSalary.text = tmpText
					} else {
						bindingClass.showSalary.text = "Не корректный ПИН-КОД"
					}
				}
				Staff.WORKER_NAME -> {
					val tmpText = "Получите ваши ${Staff.WORKER_SALARY}"
					if (passField == Staff.WORKER_PASS) {
						bindingClass.showSalary.text = tmpText
					} else {
						bindingClass.showSalary.text = "Не корректный ПИН-КОД"
					}
				}
				else -> {
					bindingClass.showSalary.text = "Нет такого сотрудника"
				}
			}

		}
	}
}

