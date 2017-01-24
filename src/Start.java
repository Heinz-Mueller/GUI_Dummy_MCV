/**
 * Created by E.E on 09.01.2017.
 */

import model.*;
import view.*;

public class Start
{
    public static void main(String[] args)
    {
        DataModel model = new DataModel();
        Einloggen einloggen = new Einloggen (model);
        Tafel tafel = new Tafel(model);
        Bearbeitung bearbeitung = new Bearbeitung(model);
        //PieChartView pieChartView = new PieChartView (model);
        //BarChartView barChartView = new BarChartView (model);
    }
}
