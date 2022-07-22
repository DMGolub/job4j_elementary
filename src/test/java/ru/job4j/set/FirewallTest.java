package ru.job4j.set;

import java.util.Set;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FirewallTest {

    @Test
    public void checkName() {
        Set<String> words = Set.of("instagram", "фото", "мем", "котик");
        String s = "Создание многомодульного Gradle проекта SpringBoot + Angular в IDEA";
        String rsl = Firewall.checkName(s, words);
        assertThat(rsl).isEqualTo("Вы сделали правильный выбор!");
    }

    @Test
    public void checkNameFalse() {
        Set<String> words = Set.of("instagram", "фото", "мем", "котик");
        String s = "Криштиану Роналду опубликовал новую фотографию с детьми в instagram";
        String rsl = Firewall.checkName(s, words);
        assertThat(rsl).isEqualTo("Выберите другую статью...");
    }
}