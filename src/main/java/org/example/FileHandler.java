package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FileHandler {
    public float[] getDataSet(Boolean unique) {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Float> desiredValues = new ArrayList<>();
        Set<Float> uniqueValues = new HashSet<>();
        try {
            InputStream inputStream = FileHandler.class.getClassLoader().getResourceAsStream("whiteRedWines.json");

            if (inputStream == null) {
                System.out.println("File not found in resources.");
                return null;
            }

            JsonNode rootNode = objectMapper.readTree(inputStream);

            if (rootNode.isArray()) {
                for (JsonNode node : rootNode) {
                    JsonNode desiredVariableNode = node.get("alcohol");

                    if (desiredVariableNode != null) {
                        desiredValues.add(desiredVariableNode.floatValue());
                        uniqueValues.add(desiredVariableNode.floatValue());
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        float[] resultArray = new float[desiredValues.size()];
        float[] uniqueArray = new float[uniqueValues.size()];

        int index = 0;
        for (Float value : uniqueValues) {
            uniqueArray[index++] = value;
        }

        for (int i = 0; i < desiredValues.size(); i++) {
            resultArray[i] = desiredValues.get(i);
        }
        if (unique) return uniqueArray;
        return resultArray;
    }
}
