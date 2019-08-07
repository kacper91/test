package com.kodilla.patterns.social;

import com.kodilla.patterns.strategy.social.*;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User zenon = new Millenials("Zenon");
        User kacper = new YGeneration("Kacper");
        User pawel  = new ZGeneration("Paweł");



        //When
        String zenonShare = zenon.sharePost();
        String kacperShare = kacper.sharePost();
        String pawelShare = pawel.sharePost();

        System.out.println("Zenon share: " + zenonShare);
        System.out.println("Kacper share: " + kacperShare);
        System.out.println("Pawel share: " + pawelShare);

        //Then
        Assert.assertEquals("You are currently using Twitter ", zenonShare);
        Assert.assertEquals("You are currently using Facebook ", kacperShare);
        Assert.assertEquals("You are currently using Snapchat ", pawelShare);

    }

    @Test
    public void testIndividualSharingStrategy(){

        //Given
        User zenon = new Millenials("Zenon");

        //When
        String zenonShare = zenon.sharePost();
        System.out.println("Zenon share: " + zenonShare);
        zenon.setSocialPublisher(new SnapchatPublisher());
        zenonShare = zenon.sharePost();
        System.out.println("Zenon should now share" + zenonShare);

        //Then
        Assert.assertEquals("You are currently using Snapchat ", zenonShare);
    }


}
