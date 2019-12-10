package sistema_experto

class Statement {
    String literal
    String descripcion
    Tipo tipo
    String tag
    static constraints = {
      tipo display: false
    }

}

public enum Tipo {
  ANTECEDENTE,
  CONSECUENTE,
  AMBOS
}
