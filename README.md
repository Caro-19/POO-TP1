# Sistema Bancario - Java POO 🏦

Este proyecto consiste en el modelado y desarrollo de un sistema de gestión bancaria utilizando **Java**. El objetivo principal es aplicar conceptos avanzados de Programación Orientada a Objetos (POO) para gestionar diferentes tipos de clientes y cuentas. 

## 📋 Descripción del Proyecto

El sistema permite la administración de clientes y sus respectivas cuentas bancarias, implementando lógica para depósitos, extracciones, cobro de intereses y operaciones multimoneda.

### Estructura de Clases Principales

El modelo se basa en una jerarquía de clases diseñada para la máxima reutilización de código:

#### Clientes
* **Cliente (Abstracta):** Clase base que define el número identificador del cliente.
* **ClienteIndividual:** Incorpora Nombre, Apellido y DNI.
* **ClienteEmpresa:** Diseñada para personas jurídicas con Nombre de Fantasía y CUIT.

#### Cuentas
* **Cuenta (Abstracta):** Define el comportamiento base (Número de cuenta, Cliente y Saldo) con métodos abstractos `depositar()` y `extraer()`.
* **Caja de Ahorro:** Permite extracciones hasta el límite del saldo y el cobro de intereses mensuales.
* **Cuenta Corriente:** Introduce el "giro en descubierto" y el depósito de cheques.
* **Cuenta Convertibilidad:** Especialización de la Cuenta Corriente para empresas que permite operar en pesos y dólares.

## 🛠️ Tecnologías Utilizadas

* **Java 17+**
* **Lombok:** Para reducir el código repetitivo mediante anotaciones como `@Getter`, `@Setter` y `@ToString`.
* [cite_start]**UML:** Para el modelado visual de la arquitectura. [cite: 30]

## 📐 Diagrama de Clases

El diseño sigue una arquitectura de herencia clara:

* **Clases Padres (Abstratas):** `Cliente` y `Cuenta`.
* **Clases Hijas:** `ClienteIndividual`, `ClienteEmpresa`, `CajaDeAhorro` y `CuentaCorriente`.
* **Clase Especializada:** `CuentaConvertibilidad` (Hija de Cuenta Corriente).
