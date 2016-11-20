package bannergrailsapp

import grails.boot.config.GrailsAutoConfiguration
import mrhaki.grails.BannerGrailsApp

class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {
        final BannerGrailsApp app = new BannerGrailsApp(Application)
        app.run(args)
    }
}