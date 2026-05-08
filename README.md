Sistema Bancario - Java POO 🏦
Este proyecto consiste en el modelado y desarrollo de un sistema de gestión bancaria utilizando Java y el framework Spring Boot. El objetivo principal es aplicar conceptos avanzados de Programación Orientada a Objetos (POO), como herencia, polimorfismo y clases abstractas, para gestionar diferentes tipos de clientes y cuentas.

📋 Descripción del Proyecto
El sistema permite la administración de clientes (individuales y empresas) y sus respectivas cuentas bancarias. Se destaca la implementación de una lógica de negocio flexible que permite realizar depósitos, extracciones, cobro de intereses y operaciones multimoneda a través de un sistema de convertibilidad.

Estructura de Clases Principales
El modelo se basa en una jerarquía de clases diseñada para la máxima reutilización de código:

Clientes
Cliente (Abstracta): Clase base que define el número identificador del cliente.

ClienteIndividual: Extiende de Cliente, incorporando Nombre, Apellido y DNI.

ClienteEmpresa: Extiende de Cliente, diseñada para personas jurídicas con Nombre de Fantasía y CUIT.

Cuentas
Cuenta (Abstracta): Define el comportamiento base de cualquier cuenta (Número de cuenta, Cliente asociado, Saldo) y establece los métodos abstractos depositar() y extraer().

Caja de Ahorro: Permite extracciones hasta el límite del saldo disponible y el cobro de intereses mensuales.

Cuenta Corriente: Introduce el concepto de "giro en descubierto", permitiendo extracciones que superen el saldo real hasta un monto autorizado. También permite el depósito de cheques.

Cuenta Convertibilidad: Una especialización de la Cuenta Corriente para empresas que permite operar en pesos y dólares, incluyendo funciones de conversión entre ambas monedas.

🛠️ Tecnologías Utilizadas
Java 17+

Spring Boot

Lombok: Para reducir el código repetitivo (Boilerplate) mediante anotaciones como @Getter, @Setter y @ToString.

UML: Para el modelado visual de la arquitectura del sistema.

📐 Diagrama de Clases
El diseño sigue una arquitectura de herencia clara, como se muestra en el diagrama adjunto al proyecto:

Clases Padres (Verde): Cliente y Cuenta.

Clases Hijas (Azul): ClienteIndividual, ClienteEmpresa, CajaDeAhorro y CuentaCorriente.

Clase Especializada (Rosa): CuentaConvertibilidad (Hija de Cuenta Corriente).
