package com.qualtrics.digital;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
class EmbeddedFeedbackAccessibilityConstants {
    static Map<String, String> THUMBS_UP_LANGUAGES = createThumbsUpMap();
    static final Map<String, String> THUMBS_DOWN_LANGUAGES = createThumbsDownMap();
    static final Map<String, String> CLOSE_LANGUAGES = createCloseMap();
    static final Map<String, String> NeitherHelpfulNorUnhelpful_LANGUAGES = createNeitherHelpfulNorUnhelpfulMap();
    static final Map<String, String> ExtremelyUnhelpful_LANGUAGES = createExtremelyUnhelpfulMap();
    static final Map<String, String> SomewhatUnhelpful_LANGUAGES = createSomeWhatUnHelpfulMap();
    static final Map<String, String> SomewhatHelpful_LANGUAGES = createSomewhatHelpfulMap();
    static final Map<String, String> ExtremelyHelpful_LANGUAGES = createExtremelyHelpfulMap();

    public static Map<String, String> createCloseMap() {
        HashMap map = new HashMap();
        map.put("DE", "Schließen");
        map.put("EN", "Close");
        map.put("EN-GB", "Close");
        map.put("EN-US", "Close");
        map.put("ES-ES", "Cerrar");
        map.put("ES-419", "Cerrar");
        map.put("FI", "Sulje");
        map.put("FR", "Fermer");
        map.put("IT", "Chiudi");
        map.put("JA", "閉じます");
        map.put("KO", "닫힙니다");
        map.put("NL", "Sluiten");
        map.put("PB", "⟦용용용용 Čĺőŝе");
        map.put("PT", "Fechar");
        map.put("PT-BR", "Feche");
        map.put("ZH-HANS", "关闭");
        map.put("ZH-HANT", "關閉");
        return map;
    }

    public static Map<String, String> createExtremelyHelpfulMap() {
        HashMap map = new HashMap();
        map.put("DE", "5 – Höchste Bewertung");
        map.put("SV", "5 - Högsta bedömning");
        map.put("RU", "5 - самый высокий рейтинг");
        map.put("FI", "5 - Korkein arvio");
        map.put("PT", "5 - Classificação mais alta");
        map.put("KO", "5 - 최고 등급");
        map.put("PT-BR", "5 - Classificação mais alta");
        map.put("EN", "5 - Highest rating");
        map.put("IT", "5 - Valutazione più alta");
        map.put("FR", "5 - Note la plus élevée");
        map.put("RI-GI", "\u206a\u206a\u206a\u200d\u200c\u200b\u200d\u200d\u200c\u200c\u200d\u200d\u200d\u200b\u200b\u200d\u200b\u200b\u200c\u200d\u200d\u200d\u200d\u200c\u200b\u200b\u200c\u200c\u200d\u200c\u200c\u200d\u200c\u200b\u200b\u200d\u200b\u200d\u200c\u200d\u200b\u200c\u200d\u206a5 - Highest rating\u206a\u206a");
        map.put("ES-ES", "5 - Valoración más alta");
        map.put("ZH-HANS", "5 - 最高评级");
        map.put("ZH-HANT", "5 - 最高評分");
        map.put("PB", "⟦용용용용용 5 - Ĥįġĥĕşţ řåţіŋġ 歴歴歴歴歴⟧");
        map.put("TH", "5 - คะแนนสูงสุด");
        map.put("JA", "5 - 最高評価");
        map.put("DA", "5 - Højeste bedømmelse");
        map.put("EN-GB", "5 - Highest rating");
        map.put("NL", "5 - Beste beoordeling");
        map.put("ES-419", "5 - Calificación máxima");
        map.put("EN-US", "5 - Highest rating");
        return map;
    }

    public static Map<String, String> createExtremelyUnhelpfulMap() {
        HashMap map = new HashMap();
        map.put("DE", "1 – Niedrigste Bewertung");
        map.put("SV", "1 - Lägsta bedömning");
        map.put("RU", "1 - самая низкая оценка");
        map.put("FI", "1 - Alin arvio");
        map.put("PT", "1 - Classificação mais baixa");
        map.put("KO", "1 - 최저 등급");
        map.put("PT-BR", "1 - Classificação mais baixa");
        map.put("EN", "1 - Lowest rating");
        map.put("IT", "1 - Valutazione più bassa");
        map.put("FR", "1 - Note la plus basse");
        map.put("RI-GI", "\u206a\u206a\u206a\u200d\u200c\u200b\u200d\u200d\u200b\u200d\u200c\u200b\u200b\u200b\u200b\u200d\u200d\u200c\u200c\u200d\u200b\u200d\u200c\u200c\u200c\u200d\u200d\u200b\u200c\u200b\u200b\u200d\u200d\u200c\u200b\u200b\u200c\u200b\u200d\u200b\u200c\u200b\u206a1 - Lowest rating\u206a\u206a");
        map.put("ES-ES", "1 - Valoración más baja");
        map.put("ZH-HANS", "1 - 最低评级");
        map.put("ZH-HANT", "1 - 最低評分");
        map.put("PB", "⟦용용용용용 1 - Ŀőωëѕŧ яαţîйġ 歴歴歴歴歴⟧");
        map.put("TH", "1 - การจัดอันดับต่ำสุด");
        map.put("JA", "1 - 最低評価");
        map.put("DA", "1 - Laveste bedømmelse");
        map.put("EN-GB", "1 - Lowest rating");
        map.put("NL", "1 - Slechtste beoordeling");
        map.put("ES-419", "1 - Calificación mínima");
        map.put("EN-US", "1 - Lowest rating");
        return map;
    }

    public static Map<String, String> createNeitherHelpfulNorUnhelpfulMap() {
        HashMap map = new HashMap();
        map.put("DE", "3 – Neutrale Bewertung");
        map.put("SV", "3 - Neutralt kreditbetyg");
        map.put("RU", "3 - Нейтральный рейтинг");
        map.put("FI", "3 - Neutraali arviointi");
        map.put("PT", "3 - Classificação neutra");
        map.put("KO", "3 - 중간 등급");
        map.put("PT-BR", "3 - Classificação neutra");
        map.put("EN", "3 - Neutral rating");
        map.put("IT", "3 - Valutazione neutra");
        map.put("FR", "3 - Note neutre");
        map.put("RI-GI", "\u206a\u206a\u206a\u200c\u200c\u200b\u200b\u200b\u200c\u200b\u200b\u200c\u200b\u200d\u200d\u200c\u200c\u200c\u200c\u200b\u200c\u200d\u200d\u200c\u200c\u200c\u200d\u200c\u200d\u200b\u200b\u200c\u200c\u200c\u200c\u200b\u200c\u200d\u200b\u200d\u200b\u200c\u200c\u206a3 - Neutral rating\u206a\u206a");
        map.put("ES-ES", "3 - Valoración neutra");
        map.put("ZH-HANS", "3 - 中性评级");
        map.put("ZH-HANT", "3 - 中性評分");
        map.put("PB", "⟦용용용용용 3 - Ŋεúŧяâľ яàţíиġ 歴歴歴歴歴⟧");
        map.put("TH", "3 - การให้คะแนนเป็นกลาง");
        map.put("JA", "3 - 中立評価");
        map.put("DA", "3 - Neutral rating");
        map.put("EN-GB", "3 - Neutral rating");
        map.put("NL", "3 - Neutrale beoordeling");
        map.put("ES-419", "3 - Calificación neutra");
        map.put("EN-US", "3 - Neutral rating");
        return map;
    }

    public static Map<String, String> createSomeWhatUnHelpfulMap() {
        HashMap map = new HashMap();
        map.put("DE", "2 – Niedrige Bewertung");
        map.put("SV", "2 - Låg bedömning");
        map.put("RU", "2 - Низкая оценка");
        map.put("FI", "2 - Alhainen arvostelu");
        map.put("PT", "2 - Classificação baixa");
        map.put("KO", "2 - 낮은 등급");
        map.put("PT-BR", "2 - Classificação baixa");
        map.put("EN", "2 - Low rating");
        map.put("IT", "2 - Valutazione bassa");
        map.put("FR", "2 - Note basse");
        map.put("RI-GI", "\u206a\u206a\u206a\u200d\u200c\u200c\u200b\u200c\u200b\u200d\u200b\u200b\u200d\u200d\u200b\u200c\u200c\u200c\u200b\u200c\u200d\u200b\u200c\u200c\u200c\u200b\u200c\u200c\u200b\u200c\u200d\u200c\u200d\u200c\u200b\u200b\u200b\u200b\u200d\u200c\u200d\u200d\u206a2 - Low rating\u206a\u206a");
        map.put("ES-ES", "2 - Valoración baja");
        map.put("ZH-HANS", "2 - 低评级");
        map.put("ZH-HANT", "2 - 低評分");
        map.put("PB", "⟦용용용용 2 - Ŀôώ гàŧїŋĝ 歴歴歴歴⟧");
        map.put("TH", "2 - การจัดอันดับต่ำ");
        map.put("JA", "2 - 低評価");
        map.put("DA", "2 - Lav vurdering");
        map.put("EN-GB", "2 - Low rating");
        map.put("NL", "2 - Slechte beoordeling");
        map.put("ES-419", "2 - Calificación baja");
        map.put("EN-US", "2 - Low rating");
        return map;
    }

    public static Map<String, String> createSomewhatHelpfulMap() {
        HashMap map = new HashMap();
        map.put("DE", "4 – Hohe Bewertung");
        map.put("SV", "4 - Högt betyg");
        map.put("RU", "4 - высокий рейтинг");
        map.put("FI", "4 - Korkea arvosana");
        map.put("PT", "4 - Classificação alta");
        map.put("KO", "4 - 높은 등급");
        map.put("PT-BR", "4 - Classificação alta");
        map.put("EN", "4 - High rating");
        map.put("IT", "4 - Valutazione alta");
        map.put("FR", "4 - Note élevée");
        map.put("RI-GI", "\u206a\u206a\u206a\u200c\u200c\u200c\u200b\u200c\u200d\u200b\u200b\u200d\u200c\u200c\u200c\u200b\u200d\u200d\u200b\u200c\u200b\u200d\u200c\u200b\u200b\u200c\u200d\u200b\u200c\u200c\u200b\u200d\u200c\u200c\u200c\u200d\u200c\u200b\u200c\u200c\u200d\u200d\u200d\u200c\u206a4 - High rating\u206a\u206a");
        map.put("ES-ES", "4 - Valoración alta");
        map.put("ZH-HANS", "4 - 较高评级");
        map.put("ZH-HANT", "4 - 高評級");
        map.put("PB", "⟦용용용용 4 - Ĥîĝĥ řăťĩηĝ 歴歴歴歴⟧");
        map.put("TH", "4 - การจัดอันดับสูง");
        map.put("JA", "4 - 高評価");
        map.put("DA", "4 - Høj bedømmelse");
        map.put("EN-GB", "4 - High rating");
        map.put("NL", "4 - Goede beoordeling");
        map.put("ES-419", "4 - Calificación alta");
        map.put("EN-US", "4 - High rating");
        return map;
    }

    public static Map<String, String> createThumbsDownMap() {
        HashMap map = new HashMap();
        map.put("DE", "Ablehnen");
        map.put("SV", "Tummen ned");
        map.put("RU", "Не нравится");
        map.put("FI", "Peukalo alas");
        map.put("PT", "Polegar para baixo");
        map.put("KO", "거절");
        map.put("PT-BR", "Não curto");
        map.put("EN", "Thumbs Down");
        map.put("IT", "Malissimo");
        map.put("FR", "Pouce vers le bas");
        map.put("RI-GI", "\u206a\u206a\u206a\u200c\u200b\u200c\u200b\u200b\u200d\u200c\u200c\u200c\u200b\u200c\u200d\u200d\u200d\u200c\u200c\u200d\u200d\u200d\u200d\u200c\u200c\u200d\u200d\u200c\u200c\u200d\u200d\u200c\u200d\u200d\u200c\u200c\u200b\u200b\u200d\u200d\u200d\u200d\u200d\u200c\u206aThumbs Down\u206a\u206a");
        map.put("ES-ES", "No conforme");
        map.put("ZH-HANS", "很逊");
        map.put("ZH-HANT", "不喜歡");
        map.put("PB", "⟦용용용 Τнцmвŝ Ðοωń 歴歴歴⟧");
        map.put("TH", "ไม่ชอบ");
        map.put("JA", "不賛成");
        map.put("DA", "Tommelfingeren ned");
        map.put("EN-GB", "Thumbs Down");
        map.put("NL", "Duim omlaag");
        map.put("ES-419", "Pulgar abajo");
        map.put("EN-US", "Thumbs Down");
        return map;
    }

    public static Map<String, String> createThumbsUpMap() {
        HashMap map = new HashMap();
        map.put("DE", "Zustimmen");
        map.put("SV", "Tummen upp");
        map.put("RU", "Нравится");
        map.put("FI", "Peukalo ylös");
        map.put("PT", "Polegar para cima");
        map.put("KO", "승인");
        map.put("PT-BR", "Curto");
        map.put("EN", "Thumbs Up");
        map.put("IT", "Benissimo");
        map.put("FR", "Pouce vers le haut");
        map.put("RI-GI", "\u206a\u206a\u206a\u200c\u200b\u200c\u200d\u200d\u200c\u200c\u200d\u200b\u200d\u200b\u200b\u200b\u200c\u200d\u200b\u200d\u200b\u200b\u200d\u200c\u200c\u200b\u200b\u200c\u200d\u200d\u200c\u200c\u200d\u200b\u200d\u200b\u200c\u200d\u200d\u200d\u200b\u200c\u200d\u200c\u206aThumbs Up\u206a\u206a");
        map.put("ES-ES", "Conforme");
        map.put("ZH-HANS", "赞");
        map.put("ZH-HANT", "喜歡");
        map.put("PB", "⟦용용용 Ŧнųmьś Ŭρ 歴歴歴⟧");
        map.put("TH", "ชอบ");
        map.put("JA", "賛成");
        map.put("DA", "Tommelfingeren op");
        map.put("EN-GB", "Thumbs Up");
        map.put("NL", "Duim omhoog");
        map.put("ES-419", "Pulgar arriba");
        map.put("EN-US", "Thumbs Up");
        return map;
    }
}
