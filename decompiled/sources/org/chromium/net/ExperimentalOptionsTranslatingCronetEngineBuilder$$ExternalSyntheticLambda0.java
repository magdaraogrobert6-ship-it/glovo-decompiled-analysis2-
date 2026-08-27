package org.chromium.net;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ExperimentalOptionsTranslatingCronetEngineBuilder$$ExternalSyntheticLambda0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ExperimentalOptionsTranslatingCronetEngineBuilder$$ExternalSyntheticLambda0(int i, Object obj) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    public final void applyTo(JSONObject jSONObject) throws JSONException {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        if (i == 0) {
            DnsOptions dnsOptions = (DnsOptions) obj;
            JSONObject jSONObjectCreateDefaultIfAbsent = ExperimentalOptionsTranslatingCronetEngineBuilder.createDefaultIfAbsent("AsyncDNS", jSONObject);
            if (dnsOptions.getUseBuiltInDnsResolver() != null) {
                jSONObjectCreateDefaultIfAbsent.put("enable", dnsOptions.getUseBuiltInDnsResolver());
            }
            JSONObject jSONObjectCreateDefaultIfAbsent2 = ExperimentalOptionsTranslatingCronetEngineBuilder.createDefaultIfAbsent("StaleDNS", jSONObject);
            if (dnsOptions.getEnableStaleDns() != null) {
                jSONObjectCreateDefaultIfAbsent2.put("enable", dnsOptions.getEnableStaleDns());
            }
            if (dnsOptions.getPersistHostCache() != null) {
                jSONObjectCreateDefaultIfAbsent2.put("persist_to_disk", dnsOptions.getPersistHostCache());
            }
            if (dnsOptions.getPersistHostCachePeriodMillis() != null) {
                jSONObjectCreateDefaultIfAbsent2.put("persist_delay_ms", dnsOptions.getPersistHostCachePeriodMillis());
            }
            if (dnsOptions.getStaleDnsOptions() != null) {
                DnsOptions.StaleDnsOptions staleDnsOptions = dnsOptions.getStaleDnsOptions();
                if (staleDnsOptions.getAllowCrossNetworkUsage() != null) {
                    jSONObjectCreateDefaultIfAbsent2.put("allow_other_network", staleDnsOptions.getAllowCrossNetworkUsage());
                }
                if (staleDnsOptions.getFreshLookupTimeoutMillis() != null) {
                    jSONObjectCreateDefaultIfAbsent2.put("delay_ms", staleDnsOptions.getFreshLookupTimeoutMillis());
                }
                if (staleDnsOptions.getUseStaleOnNameNotResolved() != null) {
                    jSONObjectCreateDefaultIfAbsent2.put("use_stale_on_name_not_resolved", staleDnsOptions.getUseStaleOnNameNotResolved());
                }
                if (staleDnsOptions.getMaxExpiredDelayMillis() != null) {
                    jSONObjectCreateDefaultIfAbsent2.put("max_expired_time_ms", staleDnsOptions.getMaxExpiredDelayMillis());
                }
            }
            JSONObject jSONObjectCreateDefaultIfAbsent3 = ExperimentalOptionsTranslatingCronetEngineBuilder.createDefaultIfAbsent("QUIC", jSONObject);
            if (dnsOptions.getPreestablishConnectionsToStaleDnsResults() != null) {
                jSONObjectCreateDefaultIfAbsent3.put("race_stale_dns_on_connection", dnsOptions.getPreestablishConnectionsToStaleDnsResults());
                return;
            }
            return;
        }
        if (i == 1) {
            ConnectionMigrationOptions connectionMigrationOptions = (ConnectionMigrationOptions) obj;
            JSONObject jSONObjectCreateDefaultIfAbsent4 = ExperimentalOptionsTranslatingCronetEngineBuilder.createDefaultIfAbsent("QUIC", jSONObject);
            if (connectionMigrationOptions.getEnableDefaultNetworkMigration() != null) {
                jSONObjectCreateDefaultIfAbsent4.put("migrate_sessions_on_network_change_v2", connectionMigrationOptions.getEnableDefaultNetworkMigration());
            }
            if (connectionMigrationOptions.getAllowServerMigration() != null) {
                jSONObjectCreateDefaultIfAbsent4.put("allow_server_migration", connectionMigrationOptions.getAllowServerMigration());
            }
            if (connectionMigrationOptions.getMigrateIdleConnections() != null) {
                jSONObjectCreateDefaultIfAbsent4.put("migrate_idle_sessions", connectionMigrationOptions.getMigrateIdleConnections());
            }
            if (connectionMigrationOptions.getIdleMigrationPeriodSeconds() != null) {
                jSONObjectCreateDefaultIfAbsent4.put("idle_session_migration_period_seconds", connectionMigrationOptions.getIdleMigrationPeriodSeconds());
            }
            if (connectionMigrationOptions.getRetryPreHandshakeErrorsOnAlternateNetwork() != null) {
                jSONObjectCreateDefaultIfAbsent4.put("retry_on_alternate_network_before_handshake", connectionMigrationOptions.getRetryPreHandshakeErrorsOnAlternateNetwork());
            }
            if (connectionMigrationOptions.getMaxTimeOnNonDefaultNetworkSeconds() != null) {
                jSONObjectCreateDefaultIfAbsent4.put("max_time_on_non_default_network_seconds", connectionMigrationOptions.getMaxTimeOnNonDefaultNetworkSeconds());
            }
            if (connectionMigrationOptions.getMaxPathDegradingEagerMigrationsCount() != null) {
                jSONObjectCreateDefaultIfAbsent4.put("max_migrations_to_non_default_network_on_path_degrading", connectionMigrationOptions.getMaxPathDegradingEagerMigrationsCount());
            }
            if (connectionMigrationOptions.getMaxWriteErrorEagerMigrationsCount() != null) {
                jSONObjectCreateDefaultIfAbsent4.put("max_migrations_to_non_default_network_on_write_error", connectionMigrationOptions.getMaxWriteErrorEagerMigrationsCount());
            }
            if (connectionMigrationOptions.getEnablePathDegradationMigration() != null) {
                boolean zBooleanValue = connectionMigrationOptions.getEnablePathDegradationMigration().booleanValue();
                if (connectionMigrationOptions.getAllowNonDefaultNetworkUsage() != null) {
                    boolean zBooleanValue2 = connectionMigrationOptions.getAllowNonDefaultNetworkUsage().booleanValue();
                    if (!zBooleanValue && zBooleanValue2) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unable to turn on non-default network usage without path degradation migration!");
                        return;
                    } else {
                        if (zBooleanValue && zBooleanValue2) {
                            jSONObjectCreateDefaultIfAbsent4.put("migrate_sessions_early_v2", true);
                            return;
                        }
                        jSONObjectCreateDefaultIfAbsent4.put("migrate_sessions_early_v2", false);
                    }
                }
                jSONObjectCreateDefaultIfAbsent4.put("allow_port_migration", zBooleanValue);
                return;
            }
            return;
        }
        QuicOptions quicOptions = (QuicOptions) obj;
        JSONObject jSONObjectCreateDefaultIfAbsent5 = ExperimentalOptionsTranslatingCronetEngineBuilder.createDefaultIfAbsent("QUIC", jSONObject);
        if (!quicOptions.getQuicHostAllowlist().isEmpty()) {
            jSONObjectCreateDefaultIfAbsent5.put("host_whitelist", String.join(",", quicOptions.getQuicHostAllowlist()));
        }
        if (!quicOptions.getEnabledQuicVersions().isEmpty()) {
            jSONObjectCreateDefaultIfAbsent5.put("quic_version", String.join(",", quicOptions.getEnabledQuicVersions()));
        }
        if (!quicOptions.getConnectionOptions().isEmpty()) {
            jSONObjectCreateDefaultIfAbsent5.put("connection_options", String.join(",", quicOptions.getConnectionOptions()));
        }
        if (!quicOptions.getClientConnectionOptions().isEmpty()) {
            jSONObjectCreateDefaultIfAbsent5.put("client_connection_options", String.join(",", quicOptions.getClientConnectionOptions()));
        }
        if (!quicOptions.getExtraQuicheFlags().isEmpty()) {
            jSONObjectCreateDefaultIfAbsent5.put("set_quic_flags", String.join(",", quicOptions.getExtraQuicheFlags()));
        }
        if (quicOptions.getInMemoryServerConfigsCacheSize() != null) {
            jSONObjectCreateDefaultIfAbsent5.put("max_server_configs_stored_in_properties", quicOptions.getInMemoryServerConfigsCacheSize());
        }
        if (quicOptions.getHandshakeUserAgent() != null) {
            jSONObjectCreateDefaultIfAbsent5.put("user_agent_id", quicOptions.getHandshakeUserAgent());
        }
        if (quicOptions.getRetryWithoutAltSvcOnQuicErrors() != null) {
            jSONObjectCreateDefaultIfAbsent5.put("retry_without_alt_svc_on_quic_errors", quicOptions.getRetryWithoutAltSvcOnQuicErrors());
        }
        if (quicOptions.getEnableTlsZeroRtt() != null) {
            jSONObjectCreateDefaultIfAbsent5.put("disable_tls_zero_rtt", !quicOptions.getEnableTlsZeroRtt().booleanValue());
        }
        if (quicOptions.getPreCryptoHandshakeIdleTimeoutSeconds() != null) {
            jSONObjectCreateDefaultIfAbsent5.put("max_idle_time_before_crypto_handshake_seconds", quicOptions.getPreCryptoHandshakeIdleTimeoutSeconds());
        }
        if (quicOptions.getCryptoHandshakeTimeoutSeconds() != null) {
            jSONObjectCreateDefaultIfAbsent5.put("max_time_before_crypto_handshake_seconds", quicOptions.getCryptoHandshakeTimeoutSeconds());
        }
        if (quicOptions.getIdleConnectionTimeoutSeconds() != null) {
            jSONObjectCreateDefaultIfAbsent5.put("idle_connection_timeout_seconds", quicOptions.getIdleConnectionTimeoutSeconds());
        }
        if (quicOptions.getRetransmittableOnWireTimeoutMillis() != null) {
            jSONObjectCreateDefaultIfAbsent5.put("retransmittable_on_wire_timeout_milliseconds", quicOptions.getRetransmittableOnWireTimeoutMillis());
        }
        if (quicOptions.getCloseSessionsOnIpChange() != null) {
            jSONObjectCreateDefaultIfAbsent5.put("close_sessions_on_ip_change", quicOptions.getCloseSessionsOnIpChange());
        }
        if (quicOptions.getGoawaySessionsOnIpChange() != null) {
            jSONObjectCreateDefaultIfAbsent5.put("goaway_sessions_on_ip_change", quicOptions.getGoawaySessionsOnIpChange());
        }
        if (quicOptions.getInitialBrokenServicePeriodSeconds() != null) {
            jSONObjectCreateDefaultIfAbsent5.put("initial_delay_for_broken_alternative_service_seconds", quicOptions.getInitialBrokenServicePeriodSeconds());
        }
        if (quicOptions.getIncreaseBrokenServicePeriodExponentially() != null) {
            jSONObjectCreateDefaultIfAbsent5.put("exponential_backoff_on_initial_delay", quicOptions.getIncreaseBrokenServicePeriodExponentially());
        }
        if (quicOptions.getDelayJobsWithAvailableSpdySession() != null) {
            jSONObjectCreateDefaultIfAbsent5.put("delay_main_job_with_available_spdy_session", quicOptions.getDelayJobsWithAvailableSpdySession());
        }
    }
}
