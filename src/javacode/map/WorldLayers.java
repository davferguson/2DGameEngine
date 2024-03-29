package javacode.map;

import javacode.tile.Tile;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WorldLayers {
    private List<Layer> layers = new ArrayList<>();

    public void addLayer(String filePath, Map<Integer, Tile> availableTiles){
        Layer layer = new Layer(filePath, availableTiles);
        layers.add(layer);
    }

    public List<Layer> getLayers() {
        return layers;
    }
}
