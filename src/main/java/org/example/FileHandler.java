package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    public List<Float> getDataSet() {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Float> desiredValues = new ArrayList<>();
        try {
            // Use the class loader to get the file from the resources folder
            InputStream inputStream = FileHandler.class.getClassLoader().getResourceAsStream("whiteRedWines.json");

            if (inputStream == null) {
                System.out.println("File not found in resources.");
                return null;
            }

            // Read the JSON file into a JsonNode
            JsonNode rootNode = objectMapper.readTree(inputStream);

            // Create a list to store the desired variable values


            // Assuming the JSON is an array of objects
            if (rootNode.isArray()) {
                for (JsonNode node : rootNode) {
                    // Access the specific variable (e.g., "desiredVariable") from each object
                    JsonNode desiredVariableNode = node.get("alcohol");

                    if (desiredVariableNode != null) {
                        // Add the value to the list
                        desiredValues.add(desiredVariableNode.floatValue());
                    }
                }
            }

            // Print the extracted values
            desiredValues.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return desiredValues;
    }
}
