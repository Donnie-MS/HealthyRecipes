# 🥗 Recetas Saludables del Nutricionista 🍲

Un nutricionista nos pidió que modelemos un sistema que le permita definir las recetas para recomendar a clientes. Nuestro nutricionista siempre intenta que todos los clientes estén satisfechos con su comida 😋.

---

## 🎯 ¿Te guesta esta Receta?

Cada cliente conoce el **criterio de recetas** que le gustan. Existen los siguientes criterios:

- 🟢 **Come Tutti**: cualquier receta le gusta. Es el criterio por defecto de todos los clientes.
- 🥩 **Alto Valor Nutricional**: le gustan las recetas que aporten más de una cierta cantidad mínima de calorías saludables.
- 🥑 **Premium**: quieren que la receta sea de alguno de sus autores preferidos. En el criterio se debe configurar de autores preferidos (ej. "Gato Dumas", "Francis Mallmann", "Germán Martitegui").
- 🕰️ **Recetas Tradicionales**: le gustan las recetas tradicionales.
- 🔀 **Combinados**: combinan un conjunto de los anteriores criterios. Le gusta una receta si le gusta a **todos** los criterios combinados.

---

## 🍛 Recetas y Clientes 👥

Las recetas tienen definido un **nombre**, **autor**, **valor nutricional** y **años de tradición**.  
Se define que una receta es **tradicional** si tiene **al menos 20 años de tradición** 🕰️.

De los clientes solo nos interesa conocer su **DNI** 🪪 y el **criterio** de recetas que les gustan. Cada cliente puede cambiar su criterio cuando lo desee.  
Su **DNI, en cambio, nunca se puede cambiar**.  
Por otro lado, también lleva el registro de las **recetas recibidas** 📜.

---

## 👨‍🍳 El Nutricionista

El nutricionista es quien nos encargó el sistema y quien tiene la **lista de recetas disponibles** 📒.  
Se permite agregar nuevas recetas.

Cuando el nutricionista ejecuta la acción de **visitar a un cliente** ocurre lo siguiente:

- 🔍 Busca en su lista la **primera receta adecuada** que encuentre para el cliente.
- 🤷‍♂️ En caso de que **ninguna receta resulte adecuada**, se debe generar una receta de emergencia con:

  - **nombre**: “batido mágico"
  - **autor**: en este caso es el nombre del nutricionista.
  - **valor nutricional**: 2000 calorías saludables
  - **tradición**: 0 años
    .

✅ El cliente recibe la receta y actualiza el registro de recetas recibidas.  
🗑️ Si la receta era una de la lista, obviamente se elimina de ella.
