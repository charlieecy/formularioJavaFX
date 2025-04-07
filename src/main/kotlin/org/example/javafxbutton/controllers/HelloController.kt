package org.example.javafxbutton.controllers

import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.TextField

class HelloController {
    @FXML
    private lateinit var textoAMostrar: Label

    @FXML
    private lateinit var campoTexto: TextField

    @FXML
    private lateinit var botonEnviar: Button

    /**
     * Función que se ejecuta al inicializar el programa
     */
    @FXML
    private fun initialize() {
        eventos()
    }

    @FXML
    private fun eventos(){

        //Establecemos qué ocurrirá cuando se pulse el botón
        botonEnviar.setOnAction {
            sendTextfield()
        }

        //Desactivamos el botón de enviar
        desactivarBoton()

        //Comprobamos si el texto del formulario tiene 2 o más caracteres para activar o no el botón de enviar
        dosOMasCaracteres()
    }

    @FXML
    /**
     * Obervamos la propiedad texto del formulario. Cada vez que tome un nuevo valor,
     * es decir, que el usuario teclee, se ejecuta el bloque de código que
     * comprueba si el nuevo valor de texto tiene 2 o más caracteres. En caso positivo,
     * activa el botón. En caso negativo, lo desactiva.
     */
    private fun dosOMasCaracteres() {
        campoTexto.textProperty().addListener { observable, oldvalue, newValue ->
            if (newValue.length >= 2) {
                botonEnviar.isDisable = false
            }
            if (newValue.length < 2) {
                botonEnviar.isDisable = true
            }
        }
    }

    @FXML
    /**
     * Desactiva el botón de enviar.
     */
    private fun desactivarBoton() {
        botonEnviar.isDisable = true
    }

    @FXML
    /**
     * Asigna el texto escrito en el formulario a la label y limpia el texto del formulario.
     */
    private fun sendTextfield() {
        textoAMostrar.text = campoTexto.text
        campoTexto.clear()
    }
}