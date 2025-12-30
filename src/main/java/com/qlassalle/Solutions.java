package com.qlassalle;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Solutions {

    public List<Product> heapSolution(List<Product> products, int k) {
        PriorityQueue<Product> heap = new PriorityQueue<>(k, (a, b) -> Float.compare(b.getPrice(), a.getPrice()));
        heap.addAll(products);
        if (k >= products.size()) {
            return heap.stream()
                       .toList();
        }
        var result = new ArrayList<Product>();
        while (result.size() < k) {
            result.add(heap.poll());
        }

        return result;
    }

    public List<Product> sortSolution(List<Product> products, int k) {
        products.sort((a, b) -> Float.compare(b.getPrice(), a.getPrice()));
        return products.stream().limit(k).toList();
    }
}
