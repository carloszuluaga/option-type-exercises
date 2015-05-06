package co.scalamde.example

case class Usuario(id: Int,
  nombre: String,
  apellido: String,
  edad: Int,
  genero: Option[String])

object UsuarioRepository {
  private val usuarios = Map(
    1 -> Usuario(1, "Juan", "Perez", 32, Some("masculino")),
    2 -> Usuario(2, "María", "Perez", 30, None))
  def findById(id: Int): Option[Usuario] = usuarios.get(id)
  def findAll = usuarios.values
}