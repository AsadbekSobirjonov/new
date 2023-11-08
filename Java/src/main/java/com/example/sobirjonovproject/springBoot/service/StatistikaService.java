package com.example.sobirjonovproject.springBoot.service;

import com.example.sobirjonovproject.springBoot.entity.Statistika;
import com.example.sobirjonovproject.springBoot.entity.Xodim;
import com.example.sobirjonovproject.springBoot.repository.StatistikaRepository;
import com.example.sobirjonovproject.springBoot.repository.XodimRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StatistikaService {
   private final StatistikaRepository statistikaRepository;

   private final XodimRepository xodimRepository;

    public StatistikaService(StatistikaRepository statistikaRepository, XodimRepository xodimRepository) {
        this.statistikaRepository = statistikaRepository;

        this.xodimRepository = xodimRepository;
    }

    public Map<String, Integer> xodimlarsoni(){
        List<Xodim>  xodims=xodimRepository.findAll();
        int a=0,b=0,c=0;
        for (int i = 0; i <xodims.size() ; i++) {
            if (xodims.get(i).getBolim().getId() == 1L) {
                a++;
            }
            if (xodims.get(i).getBolim().getId() == 2L) {
                b++;
            }
            if (xodims.get(i).getBolim().getId() == 3L) {
                c++;
            }
        }
        Map<String, Integer> map = new HashMap<>();
        map.put("Boshqaruv", a);
        map.put("Mijozlar", b);
        map.put("Sotuv", c);
        return map;
    }

      public Map<String,Double> xodimlarsonifoiz(){
           List<Xodim>  xodims=xodimRepository.findAll();
           Double a=0.0,b=0.0,c=0.0;
           for (int i = 0; i <xodims.size() ; i++) {
               if (xodims.get(i).getBolim().getId() == 1L) {
                   a++;
               }
               if (xodims.get(i).getBolim().getId() == 2L) {
                   b++;
               }
               if (xodims.get(i).getBolim().getId() == 3L) {
                   c++;
               }
           }
           a=a/(a+b+c);
           b=b/(a+b+c);
           c=c/(a+b+c);

           Map<String, Double> map = new HashMap<>();
           map.put("Boshqaruv", a);
           map.put("Mijozlar", b);
           map.put("Sotuv", c);
         return map;
       }
       public Map<Integer, Integer> yoshfilter(){
        Map<Integer,Integer> yosh=new HashMap<>();
           List<Xodim>  xodims=xodimRepository.findAll();
           int sum=0;
           for (int i = 18; i <65 ; i++) {
               for (int j = 18; j <65 ; j++) {
                   if (xodims.get(j).getAge()==i){
                       sum++;
                   }
               }
               yosh.put(i,sum);
               sum=0;
           }
           return yosh;
       }

       public Double umumiySumma(){
        Double summa=0.0;
           List<Xodim>  xodims=xodimRepository.findAll();
           for (Xodim xodim:xodims){
             summa+=xodim.getMaoshi();
           }
           return summa;
       }
       public Statistika getStatistika(){
           Statistika statistika=new Statistika();
           statistika.setXodimlarfoizi(xodimlarsonifoiz());
           statistika.setXodimlarsoni(xodimlarsoni());
           statistika.setXodimyoshi(yoshfilter());
           statistika.setUmumiySumma(umumiySumma());
           return statistika;
       }


   }

