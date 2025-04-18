// Representação Spring Boot do Painel de Dados do Pitomba (Civic 2010)

package com.pitomba.dashboard;

import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;
import java.util.*;

@RestController
@RequestMapping("/pitomba")
public class PitombaDashboard {

    @GetMapping("/instalados")
    public List<String> getUpgradesInstalados() {
        return List.of(
                "Central multimídia Lelong 6319",
                "Echo Auto",
                "Microfone hands-free",
                "Telas slave nos encostos de cabeça",
                "Bancos em couro",
                "Retrovisor fotocrômico",
                "Quebra-sóis com LED de cortesia",
                "Sistema de carregamento por indução",
                "Controle digital do ar-condicionado",
                "Sensor de estacionamento traseiro",
                "TPMS (com estepe)",
                "Engate traseiro homologado",
                "Alto-falantes Harman",
                "Alto-falantes JBL dianteiros",
                "4 pneus Dunlop Direzza 205/55 R16",
                "Troca de óleo (Idemitsu 0W-20)",
                "Filtro de óleo MANN W610/0",
                "Filtro de ar WEGA JFA 0429"
        );
    }

    @GetMapping("/pendentes")
    public List<String> getUpgradesPendentes() {
        return List.of(
                "Sistema Keyless Cardot TK800+",
                "Sensor volumétrico",
                "Módulo bypass",
                "Tilt Down SOFT AA.310004",
                "TURY AC05",
                "SOFT AW54",
                "Sensor crepuscular",
                "Sensor de temperatura interna",
                "Luzes LED (faróis, milhas, cortesia, torpedo, T10, comandos)",
                "Cristalização de faróis",
                "Caixa de fusíveis auxiliar (12 vias)",
                "Tomada USB traseira",
                "Tomada 12V porta-malas",
                "Geladeira automotiva Black & Decker",
                "Sistema de câmeras 360º",
                "Sistema de ponto cego (Chevrolet)",
                "Multimídia Lelong LE-6321",
                "Velas NGK Iridium",
                "Compressor do A/C Sanden TRSE07",
                "Pintura e polimento das rodas",
                "Troca de borrachas do para-brisa"
        );
    }

    @GetMapping("/familia")
    public Map<String, String> getFamilia() {
        return Map.of(
                "Condutor", "Marcelo Tavares",
                "Esposa", "Thais Araújo",
                "Filha", "Sapphire Louise Silva Tavares (5 anos)"
        );
    }

    @GetMapping("/motor")
    public Map<String, String> getMotor() {
        return Map.of(
                "Modelo", "R18A1",
                "Potência", "140 cv a 6.300 rpm",
                "Torque", "17,7 kgfm a 4.300 rpm",
                "Combustível", "Gasolina (V-Power Racing)",
                "Lubrificante", "Idemitsu 0W-20",
                "Intervalo de troca de óleo", "5.000 km",
                "Próxima troca", "155.000 km"
        );
    }
}
