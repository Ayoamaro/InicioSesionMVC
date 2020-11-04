# Inicio de sesión MVC

Implementar una aplicación en JavaFX que permita el inicio de sesión, aplicando el patrón de diseño MVC.

La interfaz deberá ser "responsive" y su aspecto será el siguiente:

![](https://github.com/Ayoamaro/InicioSesionMVC/blob/main/docs/images/incio_sesion.png?raw=true)

Para la contraseña se deberá utilizar el componente "[PasswordField](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/PasswordField.html)" en lugar de "TextField".

Al pulsar el botón "Acceder" se validarán las credenciales. Si son válidas, se mostrará un mensaje indicando "Acceso permitido" y se terminará el programa.

![](https://github.com/Ayoamaro/InicioSesionMVC/blob/main/docs/images/acceso_permitido.png?raw=true)

En caso de no ser válidas, se mostrará el mensaje "Acceso denegado" y se eliminará el contenido del cuadro de texto de la contraseña.

![](https://github.com/Ayoamaro/InicioSesionMVC/blob/main/docs/images/acceso_denegado.png?raw=true)

Al pulsar el botón "Cancelar" terminará la aplicación.

### Fichero de contraseñas

Los usuarios válidos se encontrarán en el fichero "users.csv" en formato CSV (Comma Separated Values), donde el primer campo será el nombre del usuario y el segundo la contraseña cifrada en MD5.

```
chuck,44041E67A48E7629148000666397FF53
charles,3A7C8BB6458FEA1D196D1E4C665F826F
david,586D5521413883B07AC8E7397B0F0AAD
```

### Cómo cifrar las contraseñas

Las contraseñas irán cifradas mediante el algoritmo MD5. Éstas no se pueden descifrar, sino que lo que haremos será cifrar en MD5 la contraseña introducida y comprobar que coincide con la del fichero.

Para ello usaremos la librería [Commons Codec](https://commons.apache.org/proper/commons-codec/) de Apache:

```
<dependency>
    <groupId>commons-codec</groupId>
    <artifactId>commons-codec</artifactId>
    <version>1.13</version>
</dependency>
```

Ejemplo de uso:

```
String password = "ILoveJava";
String md5 = DigestUtils.md5Hex(password).toUpperCase();
System.out.println("Password cifrado: " + md5);
```
