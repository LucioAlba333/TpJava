package data;

import java.util.LinkedList;

import entities.TipoHabitacion;

public class TipoHabitacionDao {
	public LinkedList<TipoHabitacion> list() {
		LinkedList<TipoHabitacion> tipos = new LinkedList<>();
		tipos.add(new TipoHabitacion(1, "habitacion de fuego"));
		tipos.add(new TipoHabitacion(2, "mazmorra"));
		return tipos;
	}
}
