package hilt_aggregated_deps;

import dagger.hilt.processor.internal.aggregateddeps.AggregatedDeps;
import javax.annotation.processing.Generated;

/**
 * This class should only be referenced by generated code! This class aggregates information across multiple compilations.
 */
@AggregatedDeps(
    components = "dagger.hilt.components.SingletonComponent",
    modules = "com.example.concurrency.domain.di.NetworkModule"
)
@Generated("dagger.hilt.processor.internal.aggregateddeps.AggregatedDepsGenerator")
public class _com_example_concurrency_domain_di_NetworkModule {
}
