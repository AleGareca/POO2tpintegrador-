package model;

import java.util.ArrayList;
import java.util.Date;


public class Muestra {
	private String tipoVinchuca;
	private Ubicacion ubicacion;
	private Foto foto;
	private String alias;
	private ArrayList<Verificacion> validaciones;
	private Nivel nivel;
	private Date fecha;
	private Aplicacion aplicacion;

	public Muestra(/*Ubicacion ubicacion, Foto foto,*/String tipoVinchuca) {
		//this.ubicacion = ubicacion;
		//this.foto = foto;
		this.tipoVinchuca= tipoVinchuca;
	}

	public String getTipoDeVinchuca() {
		return this.tipoVinchuca;
	}

	public void baja() {
		this.nivel = new Baja();
	}

	public void alta() {
		this.nivel = new Alta();
	}

	public void media() {
		this.nivel = new Media();
	}

	public void recivirValidacion(Verificacion v) {
		this.validaciones.add(v);
		this.nivel.verificarNivelPara(this);
	}

	public int cantVerificaciones() {
		return this.validaciones.size();
	}

	public void getNivel(Baja baja) {
		this.nivel = new Baja();

	}

	/*
	 * si las validaciones son de personas de un mismo nivel de conocimineto y si
	 * estan de acuerdo con el tipo
	 */
	public boolean validacionUnanime() {

		return aplicacion.sonDelElMismoNivel(this.aliasVerificacion()) && this.validacionesConMismoTipo();
	}

	private boolean validacionesConMismoTipo() {
		boolean res = false;

		for (Verificacion v : this.validaciones) {
			res = this.tipoVinchuca == v.getTipo();
			;
		}

		return res;
	}

	@SuppressWarnings("null")
	public ArrayList<String> aliasVerificacion() {

		ArrayList<String> res = null;
		for (Verificacion v : this.validaciones) {
			res.add(v.alias());
		}
		return res;
	}

	public ArrayList<Verificacion> getVerificaciones() {

		return this.validaciones;
	}

	public void cambiarTipo(String unTipo) {
		this.tipoVinchuca = unTipo;

	}

	public boolean hayExpertos() {
		return this.aplicacion.hayAlgunExpertoConAlias(this.aliasVerificacion());
	}



}
