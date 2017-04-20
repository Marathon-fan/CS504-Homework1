package RunningInformationAnalysisService.domain;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import org.springframework.web.bind.annotation.*;




/**
 * Created by vagrant on 4/17/17.
 */

@RestController
@RequestMapping(value = "/")
public class RunningInformationServiceImpl  {

    @Autowired
    private RunningInformationRepository runningInformationRepository;

    @RequestMapping(value = "/deleteByRunningId/{RunningId}")
    @ResponseBody
    public String delete(@PathVariable String RunningId){
        runningInformationRepository.delete(Long.valueOf(RunningId));
        return "Deleted RunningId " + RunningId + " successfully!";
    }

    @RequestMapping(value = "/findAllDisplayWithPage/{page}", method = RequestMethod.GET)
    @ResponseBody
    public Page<RunningInformation> findAllDisplayWithPage(@PathVariable String page
                                                        ){
        return runningInformationRepository.findAll(new PageRequest(Integer.valueOf(page), 2,  Sort.Direction.DESC,"heartRate"));
    }


}
