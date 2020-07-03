# TAREA5
##Amazon S3
Amazon Simple Storage Service es almacenamiento para Internet. Está diseñado para facilitar la informática a escala web para los desarrolladores.
Amazon S3 tiene una interfaz de servicios web simple que puede usar para almacenar y recuperar cualquier cantidad de datos, en cualquier momento, desde cualquier lugar de la web. Le da a cualquier desarrollador acceso a la misma infraestructura de almacenamiento de datos altamente escalable, confiable, rápida y económica que Amazon usa para ejecutar su propia red global de sitios web. El servicio tiene como objetivo maximizar los beneficios de la escala y transmitir esos beneficios a los desarrolladores.
A continuación, las configuraciones del S3:
1.	Abrir la consola de la computadora con el siguiente enlace: https://console.aws.amazon.com/s3/home
2.	Se Completa los formularios con los datos solicitados.
3.	Se selecciona la opción de alojamiento de sitios web estáticos. Para ello se llena otro formulario.
4.	Se agrega un objeto 
5.	Se carga, los archivos seleccionados desde el sistema.
6.	Se inicia la carga de los archivos en el cubo


## Para abrir / descargar un objeto :
En la cosola de amazon S3, en la lista objetos y carpetas, hay una opción que permite descargar el objeto.
### Como Mover Objetos en S3
1.	Se abre la consola de amazon s3
2.	Se selecciona la opción de archivos y carpetas en el pane. 
3.	Se busca la ubicación donde se quiete mover el objeto
### Eliminar Un Objeto
1.	Se abre amazon s3
2.	Se selecciona la opción de archivos y Carpeta en el panel
3.	Se abrirá una ventana para su confirmación
### Vaciar un balde
1.	Se abre la consola de amazon s3
2.	Se selecciona la opción que dice deposito vacío
3.	Se abrirá un mensaje de confirmación en la ventana emergente.
### Funciones de Amazon s3
Bajo costo y fácil de usar : 
con Amazon S3, el usuario puede almacenar una gran cantidad de datos a muy bajos costos.

Seguro : 
Amazon S3 admite la transferencia de datos a través de SSL y los datos se cifran automáticamente una vez que se cargan. El usuario tiene control completo sobre sus datos mediante la configuración de políticas de depósito mediante AWS IAM.

Escalable : 
con Amazon S3, no hay que preocuparse por los problemas de almacenamiento. Podemos almacenar tantos datos como tenemos y acceder a ellos en cualquier momento.

Mayor rendimiento : 
Amazon S3 está integrado con Amazon CloudFront, que distribuye contenido a los usuarios finales con baja latencia y proporciona altas velocidades de transferencia de datos sin ningún compromiso de uso mínimo.

Integrado con los servicios de AWS : 
Amazon S3 integrado con los servicios de AWS incluye Amazon CloudFront, Amazon CLoudWatch, Amazon Kinesis, Amazon RDS, Amazon Route 53, Amazon VPC, AWS Lambda, Amazon EBS, Amazon Dynamo DB, etc.

## Amazon EC2
Amazon Elastic Compute Cloud (Amazon EC2) proporciona capacidad de computación escalable en la nube de Amazon Web Services (AWS). El uso de Amazon EC2 elimina la necesidad de invertir inicialmente en hardware, de manera que puede desarrollar e implementar aplicaciones en menos tiempo. Puede usar Amazon EC2 para lanzar tantos servidores virtuales como necesite, configurar la seguridad y las redes y administrar el almacenamiento. Amazon EC2 le permite escalar hacia arriba o hacia abajo para controlar cambios en los requisitos o picos de popularidad, con lo que se reduce la necesidad de prever el tráfico.
###Amazon EC2 ofrece las siguientes características:
Entornos informáticos virtuales, conocidos como instancias

Plantillas preconfiguradas para las instancias, conocidas como imágenes de máquina de Amazon (AMI), que empaquetan las partes que necesita para el servidor (incluido el sistema operativo y el software adicional)

Varias configuraciones de CPU, memoria, almacenamiento y capacidad de red de las instancias, conocidos como tipos de instancias

Información de inicio de sesión segura para las instancias con pares de claves (AWS almacena la clave pública y usted guarda la clave privada en un lugar seguro)

Volúmenes de almacenamiento para datos temporales que se eliminan cuando detiene o termina la instancia, conocidos como volúmenes de almacén de instancias

Volúmenes de almacenamiento persistente para los datos usando Amazon Elastic Block Store (Amazon EBS), conocidos como volúmenes de Amazon EBS

Varias ubicaciones físicas para los recursos, como las instancias y los volúmenes de Amazon EBS, conocidas como regiones y zonas de disponibilidad

Un firewall que permite especificar los protocolos, los puertos y los rangos de direcciones IP que pueden alcanzar las instancias mediante el uso de grupos de seguridad

Direcciones IPv4 estáticas para informática en la nube dinámica, conocidas como direcciones IP elásticas

Metadatos, conocidos como etiquetas, que se pueden crear y asignar a los recursos de Amazon EC2

Redes virtuales que puede crear que están aisladas lógicamente del resto de la nube de AWS y que, opcionalmente, puede conectar a su propia red, conocidas como nubes privadas virtuales (VPC)

