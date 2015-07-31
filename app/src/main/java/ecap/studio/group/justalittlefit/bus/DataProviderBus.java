package ecap.studio.group.justalittlefit.bus;

import com.squareup.otto.Bus;

/**
 * An Otto event bus for {@link ecap.studio.group.justalittlefit.advanced_recyclerview.DataProvider}
 */
public class DataProviderBus {
    private static final Bus BUS = new Bus();

    public static Bus getInstance() {
        return BUS;
    }
}
