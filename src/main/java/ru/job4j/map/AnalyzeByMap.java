package ru.job4j.map;
import java.util.*;

public class AnalyzeByMap {

    public static double averageScore(List<Pupil> pupils) {
        double sum = 0;
        int count = 0;
        for (Pupil key: pupils) {
            for (Subject subject: key.subjects()) {
                sum += subject.score();
                count++;
            }
        }
        return sum / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> list = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double sum = 0;
            for (Subject subj: pupil.subjects()) {
                sum = sum + subj.score();
            }
            double avg = sum / pupil.subjects().size();
            list.add(new Label(pupil.name(), avg));
        }
        System.out.println(list);
        return list;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        List<Label> list = new ArrayList<>();
        Map<String, Integer> map = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                map.putIfAbsent(subject.name(), 0);
                map.put(subject.name(), map.get(subject.name()) + subject.score());
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            list.add(new Label(entry.getKey(), entry.getValue() / pupils.size()));
        }
        return list;
    }

    public static Label bestStudent(List<Pupil> pupils) {
     List<Label> list = new ArrayList<>();
     for (Pupil pupil : pupils) {
         double sum = 0;
         for (Subject subject : pupil.subjects()) {
             sum = sum + subject.score();
         }
         list.add(new Label(pupil.name(), sum));
     }
     list.sort(Comparator.naturalOrder());
        return list.get(list.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        List<Label> list = new ArrayList<>();
        Map<String, Integer> map = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                map.putIfAbsent(subject.name(), 0);
                map.put(subject.name(), map.get(subject.name()) + subject.score());
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
                list.add(new Label(entry.getKey(), entry.getValue()));
        }
        list.sort(Comparator.naturalOrder());
        return list.get(list.size() - 1);
    }
}
