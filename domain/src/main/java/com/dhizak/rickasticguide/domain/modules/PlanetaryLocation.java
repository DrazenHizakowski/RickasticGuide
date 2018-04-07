package com.dhizak.rickasticguide.domain.modules;

import java.util.List;

/**
 * Created by Dražen Hižak on 24/03/2018.
 */

public class PlanetaryLocation {

    public int id;
    public String name;
    public String type;
    public String dimension;
    public List<EpisodeCharacter> residents;
    public String created;

    public PlanetaryLocation(int id, String name, String type, String dimension, List<EpisodeCharacter> residents, String created) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.dimension = dimension;
        this.residents = residents;
        this.created = created;
    }

    @Override
    public String toString() {
        return "PlanetaryLocation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", dimension='" + dimension + '\'' +
                ", residents=" + residents +
                ", created='" + created + '\'' +
                '}';
    }
}
