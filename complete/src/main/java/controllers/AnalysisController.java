package controllers;

import java.util.concurrent.atomic.AtomicLong;

import Entity.AnalysisInfo;
import Entity.CommercialInfo;
import Entity.OperationInfo;
import Entity.TianYanChaInfo;
import com.gvt.riskservice.Greeting;
import com.gvt.riskservice.InputInfo;
import com.gvt.riskservice.ValidTokens;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import result.AnalysisResult;
import result.OperationResult;
import result.Result;
import result.TianYanChaResult;

@RestController
public class AnalysisController {

	private static final Logger logger = LoggerFactory.getLogger(AnalysisController.class);

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@PostMapping(value = "/ana-risk",  consumes={"application/json;charset=utf-8"}, produces = {"application/json;charset=utf-8"})
	public Result analyze(@RequestBody InputInfo inputInfo) {

		String expectedToken = inputInfo.getToken();
		if(expectedToken == null || !expectedToken.equals(ValidTokens.VALID_Token)){
			String resultCode = "201";
			logger.info("FAILED -- {}", resultCode);
			return new Result(resultCode);
		}

		float riskLevel = 0.0f;
		String result = AnalysisInfo.Result.ACCEPT.toString();
		logger.info("SUCCESS -- {} -- {}", riskLevel, result);
		return new AnalysisResult("200", new AnalysisInfo(riskLevel, result));
	}

	@PostMapping(value = "/commercial-info", consumes={"application/json;charset=utf-8"}, produces = {"application/json;charset=utf-8"})
	public Result getCommercialInfo(@RequestBody InputInfo inputInfo) {

		String expectedToken = inputInfo.getToken();
		if(expectedToken == null || !expectedToken.equals(ValidTokens.VALID_Token)){
			String resultCode = "201";
			logger.info("FAILED -- {}", resultCode);
			return new Result(resultCode);
		}

		TianYanChaInfo tianYanChaInfo = new TianYanChaInfo();
		tianYanChaInfo.setCompanyName("深圳璨宇贸易有限公司");
		tianYanChaInfo.setAddress("深圳市南山区西丽街道新围社区同沙路168号凯达尔集团中心大厦1号楼十九层1902");
		tianYanChaInfo.setTelephone("1581748****");
		tianYanChaInfo.setEmail("zj@gvt861.com");
		tianYanChaInfo.setWebsite("www.epicgal.com");

		CommercialInfo commercialInfo = new CommercialInfo();
		commercialInfo.setLegalRepresentative("曲盛");
		commercialInfo.setRegisteredCapital("500万人民币");
		commercialInfo.setPaidUpCapital("-");
		commercialInfo.setFundDate("2018-08-06");
		commercialInfo.setOperationStatus("存续");
		commercialInfo.setUSCC("91440300MA5F8T9U5F");
		commercialInfo.setBusinessRegistrationNo("-");
		commercialInfo.setTaxRegistrationNo("91440300MA5F8T9U5F");
		commercialInfo.setOrganizationNo("MA5F8T9U5");
		commercialInfo.setCompanyType("有限责任公司（法人独资）");
		commercialInfo.setBusinessIndustry("零售业");
		commercialInfo.setAuditDate("2020-01-08");
		commercialInfo.setRegistrationDepartment("深圳市市场监督管理局");
		commercialInfo.setBusinessTerm("2018-08-06至2048-08-08");
		commercialInfo.setTaxPayerQualification("-");
		commercialInfo.setEmployeeSize("小于50人");
		commercialInfo.setInsuredEmployeeSize(26);
		commercialInfo.setOldCompanyName("-");
		commercialInfo.setEnglishName("-");

		tianYanChaInfo.setCommercialInfo(commercialInfo);

		logger.info("SUCCESS -- {}", tianYanChaInfo.getCompanyName());
		return new TianYanChaResult("200", tianYanChaInfo);
	}

	@PostMapping(value = "/operation-info", consumes={"application/json;charset=utf-8"}, produces = {"application/json;charset=utf-8"})
	public Result getOperationInfo(@RequestBody InputInfo inputInfo) {

		String expectedToken = inputInfo.getToken();
		if(expectedToken == null || !expectedToken.equals(ValidTokens.VALID_Token)){
			String resultCode = "201";
			logger.info("FAILED -- {}", resultCode);
			return new Result(resultCode);
		}

		OperationInfo operationInfo = new OperationInfo();
		operationInfo.setSaleAmount(5000000);
		operationInfo.setSaleOrderCount(18000);
		operationInfo.setAverageAmountOfOrders(277.8);
		operationInfo.setAverageAmountOfPurchases(533.3);
		operationInfo.setPurchaseAmount(8000000);
		operationInfo.setPurchaseOrderCount(15000);
		operationInfo.setRateOfGrossProfit(0.55);

		logger.info("SUCCESS -- {}", operationInfo.getSaleAmount());
		return new OperationResult("200", operationInfo);

	}



}
