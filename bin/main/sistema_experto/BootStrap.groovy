package sistema_experto

class BootStrap {

    def init = { servletContext ->
      new Statement(literal: 'TDHA', descripcion: 'Trastorno por déficit de atención/hiperactividad', tipo: Tipo.CONSECUENTE, tag: 'TDHA').save()
      new Statement(literal: 'I', descripcion: 'Inatención', tipo: Tipo.AMBOS, tag: 'TDHA').save()
      new Statement(literal: 'I1', descripcion: 'Con frecuencia falla en prestar la debida atención a detalles o por descuido se cometen errores en las tareas escolares, en el trabajo o durante otras actividades', tipo: Tipo.ANTECEDENTE, tag: 'TDHA').save()
      new Statement(literal: 'I2', descripcion: 'Con frecuencia tiene dificultades para mantener la atención en tareas o actividades recreativas', tipo: Tipo.ANTECEDENTE, tag: 'TDHA').save()
      new Statement(literal: 'I3', descripcion: 'Con frecuencia parece no escuchar cuando se le habla directamente', tipo: Tipo.ANTECEDENTE, tag: 'TDHA').save()
      new Statement(literal: 'I4', descripcion: 'Con frecuencia no sigue las instrucciones y no termina las tareas escolares, los quehaceres o los deberes laborales', tipo: Tipo.ANTECEDENTE, tag: 'TDHA').save()
      new Statement(literal: 'I5', descripcion: 'Con frecuencia tiene dificultad para organizar tareas y actividades', tipo: Tipo.ANTECEDENTE, tag: 'TDHA').save()
      new Statement(literal: 'I6', descripcion: 'Con frecuencia evita, le disgusta o se muestra poco entusiasta en iniciar tareas que requieren un esfuerzo mental sostenido', tipo: Tipo.ANTECEDENTE, tag: 'TDHA').save()
      new Statement(literal: 'I7', descripcion: 'Con frecuencia pierde cosas necesarias para tareas o actividades', tipo: Tipo.ANTECEDENTE, tag: 'TDHA').save()
      new Statement(literal: 'I8', descripcion: 'Con frecuencia se distrae con facilidad por estímulos externos (para adolescentes mayores y adultos, puede incluir pensamientos no relacionados)', tipo: Tipo.ANTECEDENTE, tag: 'TDHA').save()
      new Statement(literal: 'I9', descripcion: 'Con frecuencia olvida las actividades cotidianas', tipo: Tipo.ANTECEDENTE, tag: 'TDHA').save()

      new Statement(literal: 'H', descripcion: 'Hiperactividad', tipo: Tipo.AMBOS, tag: 'TDHA').save()
      new Statement(literal: 'H1', descripcion: 'Con frecuencia juguetea con o golpea las manos o los pies o se retuerce en el asiento', tipo: Tipo.ANTECEDENTE, tag: 'TDHA').save()
      new Statement(literal: 'H2', descripcion: 'Con frecuencia se levanta en situaciones en que se espera que permanezca sentado', tipo: Tipo.ANTECEDENTE, tag: 'TDHA').save()
      new Statement(literal: 'H3', descripcion: 'Con frecuencia corretea o trepa en situaciones en las que no resulta apropiado (Nota: En adolescentes o adultos, puede limitarse a estar inquieto)', tipo: Tipo.ANTECEDENTE, tag: 'TDHA').save()
      new Statement(literal: 'H4', descripcion: 'Con frecuencia es incapaz de jugar o de ocuparse tranquilamente en actividades recreativas', tipo: Tipo.ANTECEDENTE, tag: 'TDHA').save()
      new Statement(literal: 'H5', descripcion: 'Con frecuencia está "ocupado," actuando como si "lo impulsara un motor"', tipo: Tipo.ANTECEDENTE, tag: 'TDHA').save()
      new Statement(literal: 'H6', descripcion: 'Con frecuencia habla excesivamente', tipo: Tipo.ANTECEDENTE, tag: 'TDHA').save()
      new Statement(literal: 'H7', descripcion: 'Con frecuencia responde inesperadamente o antes de que se haya concluido una pregunta', tipo: Tipo.ANTECEDENTE, tag: 'TDHA').save()
      new Statement(literal: 'H8', descripcion: 'Con frecuencia le es difícil esperar su turno', tipo: Tipo.ANTECEDENTE, tag: 'TDHA').save()
      new Statement(literal: 'H9', descripcion: 'Con frecuencia interrumpe o se inmiscuye con otros', tipo: Tipo.ANTECEDENTE, tag: 'TDHA').save()
    }
    def destroy = {
    }
}
