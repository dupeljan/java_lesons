package com.dupel.ind.dancers;

import java.util.ArrayList;
import java.util.List;

public class Concerts {
    private List<Performances> performances;

    public Concerts(List<Performances> performances) {
        this.performances = performances;
    }

    public List<Performances> findDancer(Dancer dancer) {
        List<Performances> per1 = new ArrayList<>();
        for (Performances performance : performances) {
            for (Dancer dancer1 : performance.getDanceCrew().getDancers()) {
                if (dancer1.getDancerName().equals(dancer.getDancerName()))
                    per1.add(performance);
            }
        }
        outPut(per1);
        return per1;
    }
    public void outPut(List<Performances> performances){
        for(Performances performance: performances){
//            System.out.println("\t |" + lesson.getDayOfWeek() + "|");
            System.out.println("\t --------------------------------");
            System.out.println("\t " + performance.getPerformancePlace().getCityName());
            System.out.println("\t " + performance.getDateTime());
            System.out.println("\t " + performance.getDanceCrew().getCrewName());
//            System.out.println("\t " + performance);
            System.out.println();
        }
    }
}
