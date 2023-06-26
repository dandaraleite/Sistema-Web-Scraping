package br.com.dandara.processos.controller;

//import br.com.dandara.processos.HttpGet;
import br.com.dandara.processos.HttpGetRequest;
import br.com.dandara.processos.model.Processos.DadosProcessos;
import br.com.dandara.processos.model.Processos.Processos;
import br.com.dandara.processos.model.Processos.ProcessosReporsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/processos")
public class ProcessosController {

    @Autowired
    private ProcessosReporsitory repository;

        @PostMapping("processos/formulario")
        @ResponseBody
        public String buscar(@RequestBody String pid) throws InterruptedException {
            HttpGetRequest httpGet = new HttpGetRequest();
            String numeroProcesso = httpGet.getPage(pid);
            return "{\"numeroProcesso\": \"" + numeroProcesso + "\"}";
        }

    @GetMapping("/formulario")
    public String carregaFormulario() {
        return "processos/formulario";
    }

    @GetMapping
    public String carregaLista(Model model) {
        model.addAttribute("lista", repository.findAll());
        return "processos/lista";
    }

}
