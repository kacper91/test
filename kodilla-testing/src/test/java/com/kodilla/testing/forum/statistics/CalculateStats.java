package com.kodilla.testing.forum.statistics;

        import static org.mockito.Mockito.mock;
        import static org.mockito.Mockito.when;

        import org.junit.Assert;
        import org.junit.Test;

        import java.util.ArrayList;
        import java.util.List;

public class CalculateStats {

    @Test
    public void TestCalculateAdvStatistics() {

        //Given
        List<String> userNames = new ArrayList<>();
        userNames.add("Mariusz");
        userNames.add("Kacper");

        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.userNames()).thenReturn(userNames);
        calculateAdvStatistics obj = new calculateAdvStatistics();
        //When

        statisticsMock.postsCount();


        //Then
        Assert.assertEquals(statisticsMock.postsCount(), 0);
        obj.showStatistics();
    }
}
