package o;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DataStoreProviderna {
    static final List<String> IconCompatParcelizer = Arrays.asList("CREATE INDEX idx_venue_id ON venue(venue_id);", "CREATE INDEX idx_boundary_coords ON venue(vertices_min_lat, vertices_min_lon, vertices_max_lat, vertices_max_lon);");
    static final List<String> read = Arrays.asList("ALTER TABLE venue ADD vertices blob;", "ALTER TABLE venue ADD vertices_min_lat real;", "ALTER TABLE venue ADD vertices_min_lon real;", "ALTER TABLE venue ADD vertices_max_lat real;", "ALTER TABLE venue ADD vertices_max_lon real;", "CREATE INDEX idx_venue_id ON venue(venue_id);", "CREATE INDEX idx_boundary_coords ON venue(vertices_min_lat, vertices_min_lon, vertices_max_lat, vertices_max_lon);");
}
