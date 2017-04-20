package RunningInformationAnalysisService.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RunningInformationRepository extends PagingAndSortingRepository<RunningInformation, Long> {

    void delete(Long RunningId);
    Page<RunningInformation> findAll(Pageable pageable);



}
