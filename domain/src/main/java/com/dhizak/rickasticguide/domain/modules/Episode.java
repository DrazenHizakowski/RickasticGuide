package com.dhizak.rickasticguide.domain.modules;

import java.util.List;

/**
 * Created by drazenhizak on 24/03/2018.
 */

public class Episode {
    public int id;
    public String name;
    public String airDate;
    public String episode;
    public List<EpisodeCharacter> characters;
    public boolean isFavourite;
    public String created;

    public Episode(int id, String name, String airDate, String episode, List<EpisodeCharacter> characters,boolean isFavourite, String created) {
        this.id = id;
        this.name = name;
        this.airDate = airDate;
        this.episode = episode;
        this.characters = characters;
        this.isFavourite = isFavourite;
        this.created = created;
    }

    @Override
    public String toString() {
        return "Episode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", airDate='" + airDate + '\'' +
                ", episode='" + episode + '\'' +
                ", characters=" + characters +
                ", created='" + created + '\'' +
                '}';
    }
}
