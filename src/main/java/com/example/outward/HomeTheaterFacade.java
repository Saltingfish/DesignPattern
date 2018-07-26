package com.example.outward;

/**
 * Created  by kzp on 2018/7/26
 */
public class HomeTheaterFacade {

    //这就是组合，我们会用到的子系统全部都在这里
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dva;
    CDPlayer cd;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dva, CDPlayer cd, Projector projector, TheaterLights lights, Screen screen, PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dva = dva;
        this.cd = cd;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public  void watchMovie(String movie){

        //watchMovie()将我们之前手抖进行的每一项任务一次处理。
        //请注意，每一项任务都是委托给子系统中对应的组件处理的
        System.out.println("请观看电影"+movie);
        popper.on();
        popper.pop();
        lights.dim(10);
    }

    public  void endMovie(){
        System.out.println("影片已结束！");
        //endMovie（）负责关闭一切。
        //每项任务也都是委托子系统中合适的组件处理的。
        popper.off();
        lights.on();
        screen.up();
        projector.off();



    }
}
