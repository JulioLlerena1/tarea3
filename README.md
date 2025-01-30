# Tarea02-CruiseBook
El sistema CruiseBook permite a los usuarios reservar viajes en crucero a diversos destinos. Cada crucero puede ofrecer múltiples rutas y fechas de salida, así como diferentes tipos de cabinas, como suites, cabinas con balcón, interiores y familiares. Una cabina puede estar en uno de los siguientes estados: disponible, reservada, ocupada o en mantenimiento.

Los usuarios pueden buscar cruceros según criterios como destino, fecha de salida, duración del viaje y tipo de cabina. Una vez seleccionado el crucero y la cabina, el sistema reserva la cabina por un tiempo limitado, permitiendo al usuario completar el proceso de pago para confirmar la reserva. Las tarifas pueden incluir servicios adicionales, como excursiones en tierra, paquetes de bebidas o tratamientos en el spa, que los usuarios pueden personalizar.

Los operadores del crucero pueden establecer políticas de cancelación, reprogramación y reembolsos, así como condiciones específicas para cada tipo de cabina. El sistema envía notificaciones a los usuarios sobre el estado de sus reservas, detalles del itinerario, y actualizaciones importantes, a través de correo electrónico, SMS o aplicaciones de mensajería.

Si el viaje es cancelado o hay cambios significativos en el itinerario, el sistema debe gestionar el reembolso de manera automática o permitir a los usuarios modificar su reserva sin cargos adicionales. Los incidentes reportados por los usuarios, tales como problemas con la reserva, pagos o servicios a bordo, son atendidos inicialmente por el equipo de atención al cliente; si no se resuelven, se escalan a la gerencia del crucero para una solución definitiva.
## Patrones de diseño utilizados
**Factory Method:** Este patrón facilita la creación de diferentes tipos de cabinas (Interior, Familiar, Balcón, Suite) sin modificar el código existente. Si se necesita agregar un nuevo tipo de cabina, simplemente se debe crear una nueva clase que implemente la interfaz CabinaFactory y registrar la fábrica en el CabinaFactoryManager. Esto hace que el sistema sea bastante flexible para añadir nuevos tipos de cabinas.

**Chain of Responsibility:** Este patrón se utiliza para manejar los reportes de incidentes, permitiendo que las solicitudes se escalen desde el Servicio Técnico hasta la Gerencia. Sin embargo, la implementación actual es rígida en cuanto a la jerarquía de la cadena. Si se necesita agregar un nuevo nivel en la cadena, se debe modificar el código existente para incluir el nuevo eslabón, lo que reduce la flexibilidad.
Cada nivel en la cadena está encargado de problemas específicos según su capacidad y autoridad. Tambien es posible añadir más niveles en la cadena, como técnicos especializados o departamentos legales, sin alterar la lógica base del sistema. Los cambios o actualizaciones en un nivel no afectan a los demás, facilitando la gestión del código ,y la solicitud del cliente es atendida de forma sistemática asegurando una respuesta rápida y precisa.

**Observer:** Este patrón se utiliza para notificar cambios en el estado de las cabinas. Es bastante flexible ya que permite agregar o quitar observadores (cabinas) dinámicamente. Sin embargo, la implementación actual no maneja eficientemente la notificación de cambios en múltiples estados o eventos, lo que podría complicar la adición de nuevos tipos de notificaciones.

## Diagrama UML
![Tarea02-Patrones](https://github.com/user-attachments/assets/b3e8a7f5-b323-4e28-bd21-6a56d5dc8bb9)


