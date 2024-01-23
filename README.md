# EXAMEN JAVA SPRING - AYI

## Ejercicio 1:
Se solicita crear un proyecto de Spring MVC:
● El proyecto deberá tener una base de datos con 3 tablas: Usuarios
(“id_usuario”: Número identificatorio, “nombre”: nombre,
“password_usuario”: password), Productos (“id_producto”:
código interno de producto, “codigo_ean”: código ean,
“nombre”: nombre, “descripcion”: descripción, “precio”: precio,
“stock”: stock), Servicios (“id_servicio” Código interno de
servicio, “codigo_ean”código ean de servicio, “nombre” nombre,
“descripcion” descripción del servicio, “precio” precio,
“duracion”: duración)
● El proyecto deberá iniciar con un sistema de login, el mismo
deberá pedir usuario y password, ambos estarán cargados en la
base de datos y no deben estar encriptados. (No se debe crear
usuarios desde el proyecto de Spring Boot)
● Al ingresar al sistema, deberán mostrar el listado de Productos y
Servicios extraídos de la base de datos en formato de tabla.
● Los títulos de cada tabla (“Listado de Productos” y “Listado de
Servicios”) deben ser enviados a la vista y los mismos deben
estar en el archivo application.properties.
● Abajo de cada tabla tiene que estar el botón (Nuevo), al
presionarlo, se deberá abrir una nueva página tanto para los
Productos como para los Servicios:
- En la página de inserción, se deberán pedir los datos para
cargar en la base de datos (No se solicita validar de que se
ingresen los datos, pero si optan por realizarlo, pueden
utilizar algún método de validación que crean conveniente a
fin de evitar errores de inserción).
● La vista de Inserción, debe tener un botón para volver a la página
principal, donde se muestran los datos de los Productos y
Servicios.
● Se solicita crear por cada fila de ambas tablas, un botón para
eliminar dicha fila, al presionarlo, eliminara esa información en la
base de datos y eliminar la fila de la vista.
● Aplicar estilos de Bootstrap o CSS3 a las vistas, a preferencia. Se
puede utilizar un template también. Los estilos los definen como
más les parezca
![captura MySQL 1](https://github.com/lucashaendel/First-Exam-Spring/assets/83675953/1e178acb-d652-4131-baa9-021fe4a27f3a)
![formulario agregar servicio](https://github.com/lucashaendel/First-Exam-Spring/assets/83675953/33637a0d-e47f-42c5-92ec-85b01038e9c1)
![formulario nuevo producto](https://github.com/lucashaendel/First-Exam-Spring/assets/83675953/1de4e1ca-2ffb-492f-b999-093c1e1fbded)
![producto agregado](https://github.com/lucashaendel/First-Exam-Spring/assets/83675953/81839bb1-5c37-45ed-a126-1a07924c3323)
![servicio borrado](https://github.com/lucashaendel/First-Exam-Spring/assets/83675953/47db51c1-7011-495d-9f47-661f5f4a7592)

## Ejercicio 2:
Se solicita crear un proyecto de Spring MVC:
● En la base de datos deberá haber 2 tabla: Usuarios
(“id_usuario”: Número identificatorio, “nombre”: nombre,
“password_usuario”: password) y Proveedores
(“id_proveedor”: Código de proveedor, “nombre”: nombre,
“telefono”: teléfono de contacto, “direccion”: dirección, “email”:
correo electrónico, “sitio_web”: sitio web y “estado”: estado)
● El estado del proveedor en la base de datos es un valor numérico
1) Activo, 2) Inactivo, 3) Dado de baja.
● El proyecto deberá iniciar con un sistema de login, el mismo
deberá pedir usuario y password, ambos estarán cargados en la
base de datos y no deben estar encriptados. (No se debe crear
usuarios desde el proyecto de Spring Boot)
● Una vez ingresado el usuario y contraseña, si están correctos, se
mostrará una nueva página con los datos de los proveedores en
formato de tabla, el título (“Listado de proveedores”).
● En la tabla se debe mostrar el estado como descripción, no como
valor numérico.
● Al final de cada tabla, debe estar el boton de Insertar, al
presionarlo, se abrirá una nueva ventana y se solicitará el ingreso
de cada uno de los campos (Para el estado debe haber un select
y en la base de datos se deberá guardar el valor numérico)
● En la inserción, no se solicita validar que se ingresen todos los
datos, pero si optan por realizarlo, pueden utilizar algún método de
validación que crean más conveniente a fin de evitar errores de
inserción
● En la vista que devuelve todos los datos en forma de tabla, por
cada fila deben estar los botones de actualizar y eliminar:
- Al presionar el botón de Editar, se abrirá una nueva ventana
que se traerá los datos para poder editarlos, estos datos se
consigue por medio del código interno.
- Al presionar Eliminar, se eliminará de la base de datos el
proveedor, y en la tabla de la vista, se debe eliminar dicha
columna.
● En las vistas de Crear y Editar, deberá existir un botón para volver
a la página principal donde traer los datos de los proveedores.
● Aplicar estilos de Bootstrap o CSS3 a las vistas, a preferencia. Se
puede utilizar un template también. Los estilos los definen como
más les parezca.
![captura MySQL](https://github.com/lucashaendel/First-Exam-Spring/assets/83675953/1a3fc440-e502-4ac0-b015-d90dcb0dc588)
![inicio_login](https://github.com/lucashaendel/First-Exam-Spring/assets/83675953/0c385876-c2d6-4d16-8c92-98cab0a16960)
![listado proveedores original](https://github.com/lucashaendel/First-Exam-Spring/assets/83675953/fee9ffba-ea86-47f3-9794-42ce94e75b8c)


