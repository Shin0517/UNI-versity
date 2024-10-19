/*
題目：
設計一個「劇院場景轉換系統」

在劇院裡，場景的切換（換場）是一個重要的環節。
設計一個系統來模擬劇院的場景轉換，每個場景都有不同的佈景和背景音效。
通過介面或抽象類別來實現多型，讓場景之間的切換更加靈活，並能夠適應不同的需求。

要求：
設計一個名為 Scene 的抽象類別或介面，該類別應該包含一個抽象方法 change()，
這個方法表示場景的轉換動作。
為不同類型的場景設計具體的類別，例如：ForestScene, CityScene, BeachScene，
這些類別繼承或實作 Scene，並各自定義它們的 change() 方法（可以模擬佈景更換或音效變化）。
劇院類別 Theater 應該能夠管理不同的場景，並且能夠根據需求進行場景切換。
使用者可以添加新場景並執行場景轉換。
 */

package Practice.CH7_Inherit;

abstract class Scene{
    public abstract String change();
}

class ForestScene extends Scene{
    public String change(){
        return "( add trees, bugs, rivers. )";
    }
}

class CityScene extends Scene{
    public String change(){
        return "( add buildings, people. )";
    }
}

class BeachScene extends Scene{
    public String change(){
        return "( add seashell, sun. )";
    }
}

public class ChangeScene {
    public static void main(String[] args) {
        ForestScene amazon = new ForestScene();
        CityScene LA = new CityScene();
        BeachScene Kenting = new BeachScene();

        System.out.println("i really love to soak in mother nature. " + amazon.change());
    }
}
