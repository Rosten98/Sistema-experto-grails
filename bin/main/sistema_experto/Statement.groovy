package sistema_experto

class Statement {
    String literal
    String descripcion
    Tipo tipo
    static constraints = {
    }
}

enum Tipo {
  ANTECEDENTE,
  CONSECUENTE,
  AMBOS
}
