package com.study.restapi.apiclass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BestLanguages {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idLanguage;
    private String languageName;
    private String urlImageLanguage;
    private int rankingPosition;

    public int getIdLanguage() {
        return idLanguage;
    }

    public void setIdLanguage(int idLanguage) {
        this.idLanguage = idLanguage;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public String getUrlImageLanguage() {
        return urlImageLanguage;
    }

    public void setUrlImageLanguage(String urlImageLanguage) {
        this.urlImageLanguage = urlImageLanguage;
    }

    public int getRankingPosition() {
        return rankingPosition;
    }

    public void setRankingPosition(int rankingPosition) {
        this.rankingPosition = rankingPosition;
    }
}
