// Painel Spring Boot – Índice de Manuais Técnicos do Projeto Pitomba

package com.pitomba.documentacao;

import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;
import java.util.*;

@RestController
@RequestMapping("/pitomba/manuais")
public class ManuaisController {

    @GetMapping("/index")
    public List<Map<String, String>> getManuaisIndex() {
        List<Map<String, String>> manuais = new ArrayList<>();

        manuais.add(Map.of(
                "nome", "Manual do Proprietário",
                "arquivo", "Civic 2010 manual proprietario.pdf",
                "abrangencia", "Informações gerais, localização de fusíveis, operação básica"
        ));

        manuais.add(Map.of(
                "nome", "Manual de Serviço",
                "arquivo", "2010-civic- manual de servico.pdf",
                "abrangencia", "Procedimentos de manutenção, torque, desmontagem"
        ));

        manuais.add(Map.of(
                "nome", "Manual Flex 1.8",
                "arquivo", "civic-flex-1-8.pdf",
                "abrangencia", "Referência completa para sistemas do modelo Flex nacional"
        ));

        manuais.add(Map.of(
                "nome", "Manual Elétrico (2010CivicEletric)",
                "arquivo", "2010CivicEletric.pdf",
                "abrangencia", "Diagramas elétricos do Civic 2010 com referência de conectores e chicotes"
        ));

        manuais.add(Map.of(
                "nome", "Manual do módulo SOFT AW54",
                "arquivo", "aw-54 (1).pdf",
                "abrangencia", "Controle de vidros elétricos, fiação e jumpers"
        ));

        manuais.add(Map.of(
                "nome", "Manual Tilt Down",
                "arquivo", "tiltdown.pdf",
                "abrangencia", "Esquema de ligação do módulo de rebatimento automático do retrovisor"
        ));

        manuais.add(Map.of(
                "nome", "Manual técnico TURY AC05",
                "arquivo", "MANUAL TECNICO DE INSTALACAO AC05_REV.00_ESQUEMAS.1480067780.pdf",
                "abrangencia", "Instalação do módulo de automação de faróis, pinagem, comandos"
        ));

        return manuais;
    }
}
