/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz.controller;
import com.mycompany.quiz.model.Question;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
/**
 *
 * @author StHilaireDjoune
 */
public class QuizController {
    
    @GetMapping("/")
    public String home() {
        return "index"; 
    }

   
    @GetMapping("/math")
    public String getMath(Model model) {
        List<Question> questions = new ArrayList<>();

questions.add(new Question("Si f(x) = 2x + 3, quelle est f(5) ?", "10", "13", "15", "8", "13"));
questions.add(new Question("Résoudre : 3x - 7 = 11", "6", "5", "7", "4", "6"));
questions.add(new Question("Quel est le carré de 12 ?", "124", "144", "132", "154", "144"));
questions.add(new Question("Combien y a-t-il de degrés dans un triangle ?", "180", "90", "360", "270", "180"));
questions.add(new Question("Si x² = 49, quelle est la valeur de x ?", "7", "6", "8", "9", "7"));
questions.add(new Question("Combien font 10% de 200 ?", "10", "20", "30", "40", "20"));
questions.add(new Question("Simplifier : 5x + 2x", "7x", "10x", "7", "3x", "7x"));
questions.add(new Question("Quel est le périmètre d'un carré de côté 5 ?", "10", "15", "20", "25", "20"));
questions.add(new Question("Résoudre : x + 8 = 15", "7", "8", "9", "6", "7"));
questions.add(new Question("Si x = 2, quelle est la valeur de 3x + 1 ?", "6", "7", "5", "8", "7"));
        model.addAttribute("questions", questions);
        return "quiz";
    }

    
    @GetMapping("/chimie")
    public String getChimie(Model model) {
        List<Question> questions = new ArrayList<>();

        questions.add(new Question("Donner la formule chimique du Benzène", "C6H6", "CH4", "C2H6", "C3H8", "C6H6"));
        questions.add(new Question("Quel est le symbole de l'Oxygène ?", "O", "Ox", "O2", "Oy", "O"));
        questions.add(new Question("pH de l'eau pure ?", "7", "1", "14", "0", "7"));
        questions.add(new Question("État physique du CO2 à température ambiante ?", "Gaz", "Liquide", "Solide", "Plasma", "Gaz"));
        questions.add(new Question("Formule de l'eau ?", "H2O", "HO2", "H2O2", "OH", "H2O"));
        questions.add(new Question("Quel gaz est produit par la fermentation ?", "CO2", "O2", "N2", "H2", "CO2"));
        questions.add(new Question("L'acide chlorhydrique est de formule ?", "HCl", "H2Cl", "ClH2", "HClO", "HCl"));
        questions.add(new Question("Le sel de table est ?", "NaCl", "KCl", "CaCl2", "MgCl2", "NaCl"));
        questions.add(new Question("Formule chimique du méthane ?", "CH4", "C2H6", "C3H8", "C4H10", "CH4"));
        questions.add(new Question("Quel est le gaz le plus léger ?", "H2", "O2", "CO2", "N2", "H2"));

        model.addAttribute("questions", questions);
        return "quiz";
    }

    
    @GetMapping("/anglais")
    public String getAnglais(Model model) {
        List<Question> questions = new ArrayList<>();

        questions.add(new Question("What is the past tense of 'go'?", "went", "goed", "gone", "goes", "went"));
        questions.add(new Question("Translate: 'Bonjour' in English", "Good morning", "Hello", "Good night", "Hi", "Good morning"));
        questions.add(new Question("Choose the correct article: ___ apple", "a", "an", "the", "no article", "an"));
        questions.add(new Question("Synonym of 'hanppy'?", "sad", "joyful", "angry", "tired", "joyful"));
        questions.add(new Question("Antonym of 'cold'?", "hot", "cool", "warm", "freezing", "hot"));
        questions.add(new Question("Translate: 'Merci' in English", "Thanks", "Please", "Sorry", "Hello", "Thanks"));
        questions.add(new Question("Plural of 'child'?", "childs", "children", "childes", "child", "children"));
        questions.add(new Question("Choose the correct verb: She ___ to school.", "go", "goes", "gone", "going", "goes"));
        questions.add(new Question("Fill in: I ___ a book.", "am reading", "is reading", "are reading", "reading", "am reading"));
        questions.add(new Question("Synonym of 'big'?", "large", "tiny", "small", "short", "large"));

        model.addAttribute("questions", questions);
        return "quiz";
    }
}