package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accessfindNearestAttachedAncestor {
    public static final isAltPressedZmokQxo IconCompatParcelizer;
    public static final isAltPressedZmokQxo read;

    static {
        truncslo4al4 truncslo4al4Var = new truncslo4al4(getTypeZmokQxo.serializer(), true, true);
        truncslo4al4Var.serializer("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        truncslo4al4Var.serializer("measurement.set_default_event_parameters_with_backfill.service", true);
        truncslo4al4Var.IconCompatParcelizer(0L, "measurement.id.set_default_event_parameters.fix_service_request_ordering");
        IconCompatParcelizer = truncslo4al4Var.serializer("measurement.set_default_event_parameters.fix_app_update_logging", true);
        read = truncslo4al4Var.serializer("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        truncslo4al4Var.serializer("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }
}
