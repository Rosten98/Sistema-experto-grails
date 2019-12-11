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

      new Statement(literal: 'Inmo', descripcion: 'Trastorno de insomio', tipo: Tipo.CONSECUENTE, tag: 'Inmo').save()
      new Statement(literal: 'InmoS1', descripcion: 'Insatisfacción por la cantidad o la calidad del sueño', tipo: Tipo.AMBOS, tag: 'Inmo').save()
      new Statement(literal: 'InmoS1s1', descripcion: 'Dificultad para iniciar el sueño', tipo: Tipo.ANTECEDENTE, tag: 'Inmo').save()
      new Statement(literal: 'InmoS1s2', descripcion: 'Dificultad para mantener el sueño (despertarse frecuentemente o problemas para volver a conciliar el sueño después de despertar)', tipo: Tipo.ANTECEDENTE, tag: 'Inmo').save()
      new Statement(literal: 'InmoS1s3', descripcion: 'Despertar pronto por la mañana con incapacidad para volver a dormir', tipo: Tipo.ANTECEDENTE, tag: 'Inmo').save()
      new Statement(literal: 'InmoS2', descripcion: 'La alteración del sueño causa malestar clínicamente significativo o deterioro en lo social, laboral, educativo, académico, del comportamiento entre otras', tipo: Tipo.ANTECEDENTE, tag: 'Inmo').save()
      new Statement(literal: 'InmoS3', descripcion: 'La dificultad del sueño se produce al menos tres noches a la semana ', tipo: Tipo.ANTECEDENTE, tag: 'Inmo').save()
      new Statement(literal: 'InmoS4', descripcion: 'La dificultad del sueño está presente durante un mínimo de tres meses. ', tipo: Tipo.ANTECEDENTE, tag: 'Inmo').save()
      new Statement(literal: 'InmoS5', descripcion: 'La dificultad del sueño se produce a pesar de las condiciones favorables para dormir', tipo: Tipo.ANTECEDENTE, tag: 'Inmo').save()
      new Statement(literal: 'InmoS6', descripcion: 'El insomnio no se puede atribuir a los efectos fisiológicos de una sustancia ', tipo: Tipo.ANTECEDENTE, tag: 'Inmo').save()

      new Statement(literal: 'Tics', descripcion: 'Trastorno de tics', tipo: Tipo.CONSECUENTE, tag: 'Tics').save()
      new Statement(literal: 'TicsS1', descripcion: 'Presenta tics motores o vocales', tipo: Tipo.ANTECEDENTE, tag: 'Tics').save()
      new Statement(literal: 'TicsS2', descripcion: 'Los tics aparecen intermitentemente en frecuencia', tipo: Tipo.ANTECEDENTE, tag: 'Tics').save()
      new Statement(literal: 'TicsS3', descripcion: 'Los tics persisten durante más de un año desde la aparición del primer tic', tipo: Tipo.ANTECEDENTE, tag: 'Tics').save()
      new Statement(literal: 'TicsS4', descripcion: 'Comenzaron antes de los 18 años', tipo: Tipo.ANTECEDENTE, tag: 'Tics').save()
      new Statement(literal: 'TicsS5', descripcion: 'Los tics son producto de alguna sustancia o otra afección medica', tipo: Tipo.ANTECEDENTE, tag: 'Tics').save()

      new Statement(literal: 'Hiper', descripcion: 'Trastorno de hipersomnia', tipo: Tipo.CONSECUENTE, tag: 'Hiper').save()
      new Statement(literal: 'HiperS1', descripcion: 'El individuo refiere somnolencia excesiva (hipersomnia) a pesar de haber dormido durante un período principal que dura al menos siete horas', tipo: Tipo.AMBOS, tag: 'Hiper').save()
      new Statement(literal: 'HiperS1s1', descripcion: 'Tiene períodos recurrentes de sueño o de caerse de sueño en el mismo día', tipo: Tipo.ANTECEDENTE, tag: 'Hiper').save()
      new Statement(literal: 'HiperS1s2', descripcion: 'Descansa más de nueve horas diarias y no es reparador', tipo: Tipo.ANTECEDENTE, tag: 'Hiper').save()
      new Statement(literal: 'HiperS1s3', descripcion: 'Tiene dificultad para estar totalmente despierto después de despertar bruscamente', tipo: Tipo.ANTECEDENTE, tag: 'Hiper').save()
      new Statement(literal: 'HiperS2', descripcion: 'Lo anterior se produce al menos tres veces a la semana', tipo: Tipo.ANTECEDENTE, tag: 'Hiper').save()
      new Statement(literal: 'HiperS3', descripcion: 'Esto provoca un malestar significativo o deterioro en lo cognitivo, social, laboral u otras áreas importantes del funcionamiento', tipo: Tipo.ANTECEDENTE, tag: 'Hiper').save()
      new Statement(literal: 'HiperS4', descripcion: 'Esto es producto de una sustancia o otra afección medica', tipo: Tipo.ANTECEDENTE, tag: 'Hiper').save()

      new Statement(literal: 'Con', descripcion: 'Trastorno de conducta', tipo: Tipo.CONSECUENTE, tag: 'Con').save()
      new Statement(literal: 'ConS1', descripcion: 'Un patrón repetitivo y persistente de comportamiento en el que no se respetan los derechos básicos de otros, las normas o reglas sociales propias de la edad', tipo: Tipo.AMBOS, tag: 'Con').save()
      new Statement(literal: 'ConS1s1', descripcion: 'A menudo acosa, amenaza o intimada a otros', tipo: Tipo.ANTECEDENTE, tag: 'Con').save()
      new Statement(literal: 'ConS1s2', descripcion: 'A menudo inicia peleas', tipo: Tipo.ANTECEDENTE, tag: 'Con').save()
      new Statement(literal: 'ConS1s3', descripcion: 'Ha usado un arma que puede provocar serios daños a terceros ', tipo: Tipo.ANTECEDENTE, tag: 'Con').save()
      new Statement(literal: 'ConS1s4', descripcion: 'Ha ejercido la crueldad física contra personas', tipo: Tipo.ANTECEDENTE, tag: 'Con').save()
      new Statement(literal: 'ConS1s5', descripcion: 'Ha ejercido la crueldad física contra animales', tipo: Tipo.ANTECEDENTE, tag: 'Con').save()
      new Statement(literal: 'ConS1s6', descripcion: 'Ha robado enfrentándose a una víctima', tipo: Tipo.ANTECEDENTE, tag: 'Con').save()
      new Statement(literal: 'ConS1s7', descripcion: 'Ha violado sexualmente a alguien', tipo: Tipo.ANTECEDENTE, tag: 'Con').save()
      new Statement(literal: 'ConS1s8', descripcion: 'Ha prendido fuego deliberadamente con la intención de provocar daños graves', tipo: Tipo.ANTECEDENTE, tag: 'Con').save()
      new Statement(literal: 'ConS1s9', descripcion: 'Ha destruido deliberadamente la propiedad de alguien pero no por medio de fuego', tipo: Tipo.ANTECEDENTE, tag: 'Con').save()
      new Statement(literal: 'ConS1s10', descripcion: 'Ha invadido la casa, edificio o automóvil de alguien', tipo: Tipo.ANTECEDENTE, tag: 'Con').save()
      new Statement(literal: 'ConS1s11', descripcion: ' A menudo miente para obtener objetos o favores, o para evitar obligaciones', Tipo: Tipo.ANTECEDENTE, tag: 'Con').save()
      new Statement(literal: 'ConS1s12', descripcion: 'Ha robado objetos de cierto valor sin enfrentarse a la víctima', tipo: Tipo.ANTECEDENTE, tag: 'Con').save()
      new Statement(literal: 'ConS1s13', descripcion: 'A menudo sale por la noche a pesar de la prohibición de sus padres, y si es así, empezó antes de los 13 años', tipo: Tipo.ANTECEDENTE, tag: 'Con').save()
      new Statement(literal: 'ConS1s14', descripcion: 'Ha pasado una noche fuera de casa sin permiso mientras vivía con sus padres o en un hogar de acogida, por lo menos dos veces', tipo: Tipo.ANTECEDENTE, tag: 'Con').save()
      new Statement(literal: 'ConS1s15', descripcion: 'A menudo falta en la escuela y si es así, empezó antes de los 13 años', tipo: Tipo.ANTECEDENTE, tag: 'Con').save()
      new Statement(literal: 'ConS2', descripcion: 'Su conducta le a provocado un malestar o problemas en las áreas del funcionamiento social, académico o laboral', Tipo: Tipo.ANTECEDENTE, tag: 'Con').save()

    }
    def destroy = {
    }
}
