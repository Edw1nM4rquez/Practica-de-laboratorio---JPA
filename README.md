*Desarrollo de una aplicacion JEE basado en Servlets, JSP y JPA para el intercambio de datos
 en un modelo de tres capas aplicando los patrones diseno de software MVC y DAO*

<h2>Base de datos</h2>

<center><img src="Imagenes/foto8.PNG"></center>

1.	Crear un repositorio en GitHub con el nombre �Pr�ctica de laboratorio 01: Servlets, JSP y JPA�
<img src="Imagenes/foto.png">

2.	Desarrollar una aplicaci�n con tecnolog�a JEE para gestionar una agenda telef�nica en la web.
1.1.	Se pide desarrollar una aplicaci�n JEE que permita implementar una agenda telef�nica en donde se tendr�n usuarios con datos como cedula, nombres, apellidos, correo y contrase�a. Y cada uno de estos usuarios podr� tener asignado uno o m�s tel�fonos de contacto de diferente tipo y operador, por ejemplo: 
 
� El usuario �Juanito� tiene los tel�fonos 0998121212 de tipo celular y operadora Movistar; as� como tambi�n tiene asignado el tel�fono 0728222111 de tipo convencional y operador CNT. 
 
De igual manera cada usuario podr� tener asignado a su agenda telef�nica cero o muchos usuarios del sistema. Para lo cual, se propone el siguiente diagrama de clases: 
1.2.	Los requerimientos funcionales del sistema son:
Los usuarios pueden registrarse en la aplicaci�n a trav�s de un formulario de creaci�n de cuentas. 
<img src="Imagenes/foto1.png">

Un usuario puede iniciar sesi�n usando su correo y contrase�a.

<img src="Imagenes/foto2.png">

- Una vez iniciado sesi�n el usuario podr�:
Registrar, modificar, eliminar, buscar y listar sus tel�fonos
<img src="Imagenes/foto3.png">

Listar los n�meros de tel�fono de un usuario usando su n�mero de c�dula o correo electr�nico

<img src="Imagenes/foto4.png">

Podr� llamar o enviar un correo electr�nico desde el sistema usando aplicaciones externas. 

<img src="Imagenes/foto5.png">

<img src="Imagenes/foto6.png">

3.	Realizar varios commits en la herramienta GitHub que demuestren el desarrollo de la aplicaci�n.

<img src="Imagenes/foto7.png">

<h1>Conclusiones</h1>
<h4>- La principal ventaja de utilizar JSP frente algunos lenguajes tradicionales, nos ayuda a desarrollar p�ginas web din�micas basadas en HTML, XML, otro tipo de documentos.</h4>
<h4>- Los servlets nos ayuda ampliar capacidades por ejemplo de un servidor, ya que son peque�os programas que se ejecutan en el contexto de un navegador web.</h4>
<h4>- JPA Java Persistence API, m�s conocida por sus siglas JPA, es la API de persistencia desarrollada para la plataforma Java EE. </h4>
<h4>- Una de las ventajas de utilizar el Patr�n DAO es que cualquier objeto de negocio (aquel que contiene detalles espec�ficos de operaci�n o aplicaci�n) no requiere conocimiento directo del destino final de la informaci�n que manipula.</h4>