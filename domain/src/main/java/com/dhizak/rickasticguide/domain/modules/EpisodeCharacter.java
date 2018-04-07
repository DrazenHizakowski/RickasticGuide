package com.dhizak.rickasticguide.domain.modules;

import java.util.List;

/**
 * Created by drazenhizak on 24/03/2018.
 */

public class EpisodeCharacter {
    public int id;
    public String name;
    public String status;
    public String species;
    public String type;
    public String gender;
    public Origin origin;
    public PlanetaryLocation location;
    public String image;
    public List<Episode> episode;
    public boolean isFavourite;
    public String created;

    public EpisodeCharacter(int id, String name, String status, String species, String type, String gender,
                     Origin origin, PlanetaryLocation location, String image, List<Episode> episode, boolean isFavourite, String created) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.species = species;
        this.type = type;
        this.gender = gender;
        this.origin = origin;
        this.location = location;
        this.image = image;
        this.episode = episode;
        this.isFavourite = isFavourite;
        this.created = created;
    }

    @Override
    public String toString() {
        return "EpisodeCharacter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", species='" + species + '\'' +
                ", type='" + type + '\'' +
                ", gender='" + gender + '\'' +
                ", origin=" + origin +
                ", location=" + location +
                ", image='" + image + '\'' +
                ", episode=" + episode +
                ", created='" + created + '\'' +
                '}';
    }
}
